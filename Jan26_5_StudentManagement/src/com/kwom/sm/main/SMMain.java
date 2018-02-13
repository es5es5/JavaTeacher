package com.kwom.sm.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.kwom.sm.student.Student;

public class SMMain {
	public static void main(String[] args) {
		// Ű���� �Է¹��� �غ�
		Scanner keyboard = null;
		// ���Ͽ� �� �غ�
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			keyboard = new Scanner(System.in);

			FileWriter fw = new FileWriter("D:\\Kwon\\student.txt", true);
			bw = new BufferedWriter(fw);

			FileReader fr = new FileReader("D:\\Kwon\\student.txt");
			br = new BufferedReader(fr);

			int menu = 0;
			String name = null;
			String bd = null;
			String txt = null;
			String line = null;
			String[] line2 = null;
			Student s = null;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			while (true) {
				System.out.println("1. �л����");
				System.out.println("2. �л���ȸ");
				System.out.println("3. ����");
				System.out.println("-----------");
				System.out.print("���� : ");
				menu = keyboard.nextInt();

				if (menu == 2) {
					while ((line = br.readLine()) != null) {
						line2 = line.split(",");
						// String -> Date
						s = new Student(line2[0], sdf.parse(line2[1]));
						s.introduce();
					}

				} else if (menu == 1) {
					System.out.print("�̸� : ");
					name = keyboard.next();
					System.out.print("����(YYYYMMDD) : ");
					bd = keyboard.next();

					txt = String.format("%s,%s\r\n", name, bd);
					bw.write(txt);
					bw.flush();

				} else if (menu == 3) {
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			keyboard.close();
			try {
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
