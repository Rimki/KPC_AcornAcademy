package java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;

		try {
			fr = new FileReader("c:\\dev\\FileDemo.java");
			fw = new FileWriter("c:\\dev\\FileDemo4.java");

			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw, true);// true : autoFlush

			String readLine = null;
//			br.readLine(): 개행을 뺀 한줄을 읽는다.
			while ((readLine = br.readLine()) != null) {
//				bw.write(readLine);
//				bw.newLine();
				pw.println(readLine);
			}
//			bw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
				if (fw != null)
					fw.close();
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
				if (pw != null)
					pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
