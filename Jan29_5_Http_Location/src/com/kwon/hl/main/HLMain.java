package com.kwon.hl.main;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class HLMain {
	public static void main(String[] args) {
		Scanner keyboard = null;
		HttpsURLConnection huc = null;
		try {
			keyboard = new Scanner(System.in);

			System.out.print("�����̸� : ");
			String locName = keyboard.next();
			locName = URLEncoder.encode(locName, "utf-8");

			System.out.print("�˻��� : ");
			String str = keyboard.next();
			str = URLEncoder.encode(str, "utf-8");

			// ���׸� -> ��ǥ��
			String url = "https://dapi.kakao.com/v2/local/search/address.json";
			url += "?query=" + locName;

			URL u = new URL(url);
			huc = (HttpsURLConnection) u.openConnection();
			huc.addRequestProperty("Authorization", "KakaoAK 172fc1fbb03529f956106c89d5a40c4a");

			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");

			JSONParser jp = new JSONParser();
			JSONObject locData = (JSONObject) jp.parse(isr);
			JSONArray documents = (JSONArray) locData.get("documents");
			JSONObject loc = null;
			String x = null;
			String y = null;
			JSONObject jo = null;
			JSONArray ja = null;
			JSONObject place = null;
			for (int i = 0; i < documents.size(); i++) {
				loc = (JSONObject) documents.get(i);
				System.out.println(loc.get("address_name"));
				x = (String) loc.get("x");
				y = (String) loc.get("y");
				url = "https://dapi.kakao.com/v2/local/search/keyword.json";
				url += "?query=" + str + "&x=" + x+ "&y=" + y+ "&radius=10000";
				u = new URL(url);
				huc = (HttpsURLConnection) u.openConnection();
				huc.addRequestProperty("Authorization", "KakaoAK 172fc1fbb03529f956106c89d5a40c4a");
				is = huc.getInputStream();
				isr = new InputStreamReader(is, "utf-8");
				jo = (JSONObject) jp.parse(isr);
				ja = (JSONArray) jo.get("documents");
				for (int j = 0; j < ja.size(); j++) {
					place = (JSONObject) ja.get(j);
					System.out.println(place.get("place_name"));
					System.out.println(place.get("address_name"));
					System.out.println(place.get("phone"));
					System.out.println("-----");
				}
				
				System.out.println("--------");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			huc.disconnect();
			keyboard.close();
		}
	}
}
