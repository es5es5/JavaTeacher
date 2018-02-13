package com.kwon.hd.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// 172fc1fbb03529f956106c89d5a40c4a
public class HDMain {
	public static void main(String[] args) {
		Scanner keyboard = null;
		HttpsURLConnection huc = null;
		try {
			keyboard = new Scanner(System.in);
			System.out.print("검색어 : ");
			String str = keyboard.next();

			str = URLEncoder.encode(str, "utf-8");

			String url = "https://dapi.kakao.com/v2/search/book";
			url += "?query=" + str;

			URL u = new URL(url);
			huc = (HttpsURLConnection) u.openConnection();
			huc.addRequestProperty("Authorization", "KakaoAK 172fc1fbb03529f956106c89d5a40c4a");

			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			JSONParser jp = new JSONParser();

			// [로 시작
			// JSONArray kakaoData = (JSONArray) jp.parse(isr);

			// {로 시작
			JSONObject kakaoData = (JSONObject) jp.parse(isr);

			JSONArray documents = (JSONArray) kakaoData.get("documents");
			JSONObject book = null;
			for (int i = 0; i < documents.size(); i++) {
				book = (JSONObject) documents.get(i);
				System.out.println( book.get("title")  );
				System.out.println( book.get("sale_price")  );
				System.out.println("-----");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			keyboard.close();
			huc.disconnect();
		}
	}
}








