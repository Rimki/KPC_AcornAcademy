package java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class DaumScanDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url = new URL("https://www.daum.net/");
		InputStream in = url.openStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;

		FileWriter fw = new FileWriter("c:\\dev\\daum.html");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw, true);

		while ((readLine = br.readLine()) != null) {
//			System.out.println(readLine);
//			fw.write(readLine+"\n");
//			bw.write(readLine);
//			bw.newLine();
			pw.println(readLine);
		}
//		bw.flush();
	}
}
