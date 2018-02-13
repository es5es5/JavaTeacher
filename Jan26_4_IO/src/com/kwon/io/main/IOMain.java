package com.kwon.io.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOMain {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		try {
			// OutputStreamWriter개조형
			FileWriter fw = new FileWriter("D:\\Kwon/test.txt");
			System.out.println(10/0);
			bw = new BufferedWriter(fw);
			String str = "ㅋㅋㅋㅋ";
			bw.write(str); // 일단 불기
			bw.flush();// 빨대용량만큼 데이터를 안채워도 강제로 불기
			
		} catch (Exception e) {
			System.out.println("나누기 0 하지마");
		} finally {
			try {
				bw.close();
			} catch (Exception e) {
				System.out.println("bw가 없어");
			}
		}
				
		
		
		// 장치 -> 프로그램으로 입력
		// InputStream : 장치에서 빨아내는 빨대(1byte)
		// InputStreamReader : 2bytes
		// BufferedReader : 한줄씩
		
		// OutputStream : 장치에 집어넣는 빨대(1byte)
		// OutputStreamWriter : 2bytes
		// BufferedWriter : 한줄씩
		
		// 특수목적용
		//		PrintWriter : BufferedWriter개조, 사용하기 편함
		//		PrintStream : BufferedWriter개조, 사용하기 편함
		//		FileWriter, ...
	}
}
