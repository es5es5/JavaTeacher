package com.kwon.cs.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class CSMain {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Scanner keyboard = null;
		try {
			ss = new ServerSocket(7897);
			System.out.println("�����");
			Socket s = ss.accept(); // Ŭ���̾�Ʈ�� ������ �� ���� ���
			System.out.println("������ ������");

			keyboard = new Scanner(System.in);

			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			JFrame f = new JFrame();
			f.setSize(300, 300);
			JTextArea ta = new JTextArea();
			ta.setEditable(false);
			f.add(ta);
			f.setVisible(true);
			
			new Thread() {
				public void run() {
					while (true) {
						try {
							ta.append("��] " +br.readLine()+"\r\n");
							//System.out.println( br.readLine()  );// ������ ���������� ���
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};
			}.start();
			
			String txt = null;
			while (true) {
				System.out.print("���� : ");
				txt = keyboard.next(); // Ű���� �Է��Ҷ����� ���
				ta.append("��] " + txt + "\r\n");
				bw.write(txt + "\r\n");
				bw.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				keyboard.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
