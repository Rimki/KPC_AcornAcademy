package java_20200528;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		URL 클래스는 url 구성요소(protocol,host,port,path,query,reference)
//		를 가져올 수 있고, url 자원(html,image...)을 스트림으로 가져올 수 있다.
		URL url = new URL("https://www.naver.com/");
//		URLConnection 클래스는 url에 있는 원격 서버의 헤더 정보를 가져올 수 있고,url 자원을 스트림으로 가져올 수 있다.

		URLConnection urlCon = url.openConnection();

		String cacheControl = urlCon.getHeaderField("cache-control");
		String contentType = urlCon.getHeaderField("content-type");
		String date = urlCon.getHeaderField("date");

		System.out.println("cacheControl : " + cacheControl);
		System.out.println("contentType : " + contentType);
		System.out.println("date : " + date);

		InputStream is = urlCon.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while ((readLine = br.readLine()) != null) {
			System.out.println(readLine);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
