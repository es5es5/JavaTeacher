package com.kwon.crs.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class CRSMain {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(7897);
			
			ArrayList<Socket> sockets = new ArrayList<>();
			// 반복문 속에서 내부클래스 사용할때에는 반복문속에서 변수 만들어야
			//Socket s = null;
			while (true) {
				// 새로운 클라이언트가 접속하면
				Socket s = ss.accept();
				// ArrayList에 추가시키고
				sockets.add(s);
				// 그 클라이언트를 위한 새로운 thread시작
				new Thread() {
					public void run() {
						try {
							InputStream is = s.getInputStream();
							InputStreamReader isr = new InputStreamReader(is);
							BufferedReader br = new BufferedReader(isr);
							
							String txt = br.readLine();
							
							for (Socket socket : sockets) {
								OutputStream os = socket.getOutputStream();
								OutputStreamWriter osw = new OutputStreamWriter(os);
								BufferedWriter bw = new BufferedWriter(osw);
								bw.write(txt+"\r\n");
								bw.flush();
							}
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					};
				}.start();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}




