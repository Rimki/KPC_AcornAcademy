package java_20200527;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String url = "http://www.imbc.com";

//		HTML 문서 전체를 관리하기 위한 객체
		Document doc = null;
		try {
//			url로 연결하여 html 정보를 get 방식으로 가져온다.
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		html 정보에서 class 정보를 가져올때는 . id 정보를 가져올때는 #
		Elements elements = doc.select(".notice-list li");

		for (int i = 0; i < elements.size(); i++) {
			Element liEliment = elements.get(i);
			System.out.println(liEliment.text());
		}*/
		
		String url ="https://sports.news.naver.com/kfootball/index.nhn";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements elements = doc.select(".home_news");
		Elements liElements = elements.select(".home_news_list li");
		
		for(int i = 0;i < liElements.size(); i++) {
			Element liEliment = liElements.get(i);
			System.out.println(liEliment.text());
		}
	}

}
