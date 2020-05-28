package java_20200528;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;

		for (int i = 22; i <= 80; i++) {
			try {
				socket = new Socket("13.209.180.253",i); // 80 443 22
				System.out.println(i + "번 포트가 열려 있습니다.");
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				System.err.println("호스트가 없습니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println(i + "번 포트가 닫혀 있습니다.");
			}

		}
	}

}
