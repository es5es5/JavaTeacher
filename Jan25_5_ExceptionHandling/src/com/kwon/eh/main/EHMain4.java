package com.kwon.eh.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class EHMain4 {
	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("i : ");
		int i = keyboard.nextInt();
				
		Human h = new Human();
		System.out.println( h.divide(10, i) );
	}
}








