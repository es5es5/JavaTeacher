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
			// �ݺ��� �ӿ��� ����Ŭ���� ����Ҷ����� �ݺ����ӿ��� ���� ������
			//Socket s = null;
			while (true) {
				// ���ο� Ŭ���̾�Ʈ�� �����ϸ�
				Socket s = ss.accept();
				// ArrayList�� �߰���Ű��
				sockets.add(s);
				// �� Ŭ���̾�Ʈ�� ���� ���ο� thread����
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




