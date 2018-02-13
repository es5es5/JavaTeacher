package com.kwon.jl.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.kwon.at.product.BallPen;
import com.kwon.at.product.Book;
import com.kwon.at.product.Computer;
import com.kwon.at.product.Product;

public class JLMain {
	public static void main(String[] args) {

		Scanner keyboard = null;
		try {
			keyboard = new Scanner(System.in);
			ArrayList<Product> products = new ArrayList<>();
			while (true) {
				System.out.println("1." + Computer.class);
				System.out.println("2." + Book.class);
				System.out.println("3." + BallPen.class);
				System.out.println("-----");
				System.out.print("�� : ");
				int what = keyboard.nextInt();
				System.out.print("ǰ�� : ");
				String n = keyboard.next();
				System.out.print("���� : ");
				int p = keyboard.nextInt();
				if (what == 1) {
					System.out.print("cpu : ");
					String c = keyboard.next();
					System.out.print("ram : ");
					String r = keyboard.next();
					System.out.print("cpu : ");
					String h = keyboard.next();
					Computer pc = new Computer(n, p, c, r, h);
					products.add(pc);
				} else if (what == 2) {
					System.out.print("���� : ");
					String a = keyboard.next();
					Book b = new Book(n, p, a);
					products.add(b);
				} else {
					System.out.print("���� : ");
					String c = keyboard.next();
					BallPen bp = new BallPen(n, p, c);
					products.add(bp);
				}
				// ArrayList���� ���� ������ ū ��ǰ ���� ���
				int maxPrice = -1;
				Product maxProduct = null;
				for (int i = 0; i < products.size(); i++) {
					Product pp = products.get(i);
					int prpr = pp.getPrice();
					if (maxPrice < prpr) {
						maxPrice = prpr;
						maxProduct = pp;
					}
				}
				System.out.println("���� ��");
				maxProduct.print();
			}
		} catch (Exception e) {
			System.out.println("�Է¿���");
		} finally {
			System.out.println("��·�� ��ĳ�ʴ� ����");
			keyboard.close();
		}
	}
}
