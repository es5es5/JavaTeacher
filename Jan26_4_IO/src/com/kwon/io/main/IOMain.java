package com.kwon.io.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOMain {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		try {
			// OutputStreamWriter������
			FileWriter fw = new FileWriter("D:\\Kwon/test.txt");
			System.out.println(10/0);
			bw = new BufferedWriter(fw);
			String str = "��������";
			bw.write(str); // �ϴ� �ұ�
			bw.flush();// ����뷮��ŭ �����͸� ��ä���� ������ �ұ�
			
		} catch (Exception e) {
			System.out.println("������ 0 ������");
		} finally {
			try {
				bw.close();
			} catch (Exception e) {
				System.out.println("bw�� ����");
			}
		}
				
		
		
		// ��ġ -> ���α׷����� �Է�
		// InputStream : ��ġ���� ���Ƴ��� ����(1byte)
		// InputStreamReader : 2bytes
		// BufferedReader : ���پ�
		
		// OutputStream : ��ġ�� ����ִ� ����(1byte)
		// OutputStreamWriter : 2bytes
		// BufferedWriter : ���پ�
		
		// Ư��������
		//		PrintWriter : BufferedWriter����, ����ϱ� ����
		//		PrintStream : BufferedWriter����, ����ϱ� ����
		//		FileWriter, ...
	}
}
