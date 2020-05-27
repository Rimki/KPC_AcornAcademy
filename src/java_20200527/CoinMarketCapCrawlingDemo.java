package java_20200527;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinMarketCapCrawlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;

		String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20200101&end=20200527";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
			fw = new FileWriter("c:\\dev\\coin.txt");
			Elements trElements = doc.select(".cmc-table__table-wrapper-outer table tbody tr");
			System.out.println("날짜\t\t시가\t\t고가\t\t저가\t\t종가\t\t거래량\t\t총량\n");
			fw.write("날짜\t\t시가\t고가\t저가\t종가\t거래량\t\t총량\n");

			/*for (int i = 0; i < trElements.size(); i++) {
				Element trElement = trElements.get(i);
				Elements tdElements = trElement.select("td");
				for (int j = 0; j < tdElements.size(); j++) {
					Element tdElement = tdElements.get(j);
					System.out.print(tdElement.text() + "\t");
				}
				System.out.println("");
			}*/

			for (int i = 0; i < trElements.size(); i++) {
				Element trElement = trElements.get(i);
				String date = trElement.child(0).text();
				String open = trElement.child(1).text();
				String high = trElement.child(2).text();
				String low = trElement.child(3).text();
				String close = trElement.child(4).text();
				String volume = trElement.child(5).text();
				String MarketCap = trElement.child(6).text();
				System.out.println(date + "\t" + open + "\t" + high + "\t" + low + "\t" + close + "\t" + volume + "\t"
						+ MarketCap);

				fw.write(date + "\t" + open + "\t" + high + "\t" + low + "\t" + close + "\t" + volume + "\t" + MarketCap
						+ "\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
