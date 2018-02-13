package com.kwon.hc.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class HCMain {
	public static void main(String[] args) {
		DefaultHttpClient dhc = null;
		try {
			dhc = new DefaultHttpClient();
			
			// ��û
			HttpGet hg = new HttpGet("http://www.naver.com");
			
			// ����
			HttpResponse hr = dhc.execute(hg);
			
			// ���� ����
			HttpEntity he = hr.getEntity();
			
			// ���� ���뿡�� ������ ���� �غ�
			InputStream is = he.getContent();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}
}












