package java_20200528;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		for (int i = 2; i < 65000; i++) {
			try {
				serverSocket = new ServerSocket(i);
//				System.out.println(i + "포트를 사용할 수 있습니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println(i + "포트를 사용할 수 없습니다.");
			}
		}
	}

}
