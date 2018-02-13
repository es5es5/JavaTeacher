package com.kwon.ss.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// socket : �ǽð� ������ ����
// server : ���񽺸� �����ϴ� ��ǻ��
// client : ���񽺸� �̿��ϴ� ��ǻ��

public class SSMain {
	public static void main(String[] args) {

		ServerSocket ss = null;
		Scanner keyboard = null;
		try {
			ss = new ServerSocket(8976);
			System.out.println("���Ӵ��...");
			Socket s = ss.accept();
			System.out.println("���� ����");
			keyboard = new Scanner(System.in);

			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);

			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ��");
			System.out.println("-----");
			System.out.print("�� : ");
			int myHand = keyboard.nextInt();

			bw.write(myHand + "\r\n");
			bw.flush();

			System.out.println("������ ������");
			String str = br.readLine();
			int enemyHand = Integer.parseInt(str);

			String[] hand = { "", "����", "����", "��" };
			System.out.printf("�� : %s\n", hand[myHand]);
			System.out.printf("�� : %s\n", hand[enemyHand]);

			int result = myHand - enemyHand;
			if (result == 0) {
				System.out.println("���");
			} else if (result == -1 || result == 2) {
				System.out.println("��");
			} else {
				System.out.println("��");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			keyboard.close();
			try {
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
