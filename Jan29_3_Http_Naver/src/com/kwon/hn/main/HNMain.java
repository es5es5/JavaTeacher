package com.kwon.hn.main;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

// X9HvNHRmZ5U2NsZrh3fw
// 3T5pYJndkn
public class HNMain {
	public static void main(String[] args) {
		HttpsURLConnection huc = null;
		Scanner keyboard = null;
		try {
			keyboard = new Scanner(System.in);
			System.out.print("검색어 : ");
			String str = keyboard.next();
			// 인터넷 주소에는 한글, 특수문자 => %2A(URLEncoding)
			str = URLEncoder.encode(str, "utf-8");
			// System.out.println(str);

			String url = "https://openapi.naver.com/v1/search/news.xml";
			url += "?query=" + str;

			URL u = new URL(url);
			huc = (HttpsURLConnection) u.openConnection();
			huc.addRequestProperty("X-Naver-Client-Id", "X9HvNHRmZ5U2NsZrh3fw");
			huc.addRequestProperty("X-Naver-Client-Secret", "3T5pYJndkn");

			// 내용 빼낼 준비
			InputStream is = huc.getInputStream();
			// ctrl + shift + o
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");

			int what = xpp.getEventType(); // 현재 위치에 있는게 뭐냐
			String tagName = null;
			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (what == XmlPullParser.TEXT) {
					if (tagName.equals("title")) {
						System.out.println(xpp.getText());
					} else if (tagName.equals("description")) {
						System.out.println(xpp.getText());
						System.out.println("----------");
					}
				} else if (what == XmlPullParser.END_TAG) {

				}

				xpp.next(); // 다음으로 이동
				what = xpp.getEventType();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			keyboard.close();
			huc.disconnect();
		}

	}
}
