package com.kwon.hc.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class HCMain2 {
	public static void main(String[] args) {
		HttpsURLConnection huc = null;
		try {
			// �ּ�
			URL u = new URL("https://www.naver.com");
			huc = (HttpsURLConnection) u.openConnection();

			// ���� ���� �غ�
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			huc.disconnect();
		}

	}

}
