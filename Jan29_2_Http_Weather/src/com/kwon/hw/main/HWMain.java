package com.kwon.hw.main;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.kwon.hw.location.Location;

public class HWMain {
	public static void main(String[] args) {
		Location l1 = new Location("서울특별시 강남구 개포1동", 61, 125);
		Location l2 = new Location("경기도 수원시 영통구 원천동", 61, 120);
		Location l3 = new Location("대구광역시 북구 읍내동", 88, 92);
		Location l4 = new Location("제주특별자치도 서귀포시 남원읍", 56, 33);

		Location[] locations = { l1, l2, l3, l4 };

		for (int i = 0; i < locations.length; i++) {
			System.out.printf("%d) %s\n", i + 1, locations[i].getName());
		}
		System.out.print("뭐 : ");

		Scanner keyboard = null;
		HttpURLConnection huc = null;
		try {
			keyboard = new Scanner(System.in);
			int i = keyboard.nextInt();
			int x = locations[i - 1].getX();
			int y = locations[i - 1].getY();

			String url = String.format("http://www.weather.go.kr/wid/queryDFS.jsp?gridx=%d&gridy=%d", x, y);
			URL u = new URL(url);
			huc = (HttpURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();

			// XML or JSON에서 필요한것만 빼내는 등의 가공행위
			// parsing
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");

			String tagName = null;
			int what = xpp.getEventType(); // 현재 위치에 있는게 뭐냐
			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					
				} else if (what == XmlPullParser.TEXT) {
					if(tagName.equals("hour")) {
						System.out.printf("~%s시 : ", xpp.getText());
					} else if(tagName.equals("temp")) {
						System.out.printf("%s도, ", xpp.getText());
					} else if(tagName.equals("wfKor")) {
						System.out.println(xpp.getText());
					}
				} else if (what == XmlPullParser.END_TAG) {
					tagName = "";
				}

				xpp.next(); // 다음으로 이동
				what = xpp.getEventType();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			huc.disconnect();
			keyboard.close();
		}

	}

}


