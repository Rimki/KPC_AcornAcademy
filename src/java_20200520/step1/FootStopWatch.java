package java_20200520.step1;

import java.io.ObjectInputStream.GetField;

public class FootStopWatch {

	long startTime;
	long endTime;

	public double getElaspedTime() {
		return (double) (endTime - startTime) / 1000;
	}

	public static void main(String[] args) {

		FootStopWatch f1 = new FootStopWatch();

//		1970년 1월 1일부터 지금까지 시간을 밀리 세컨드로 반환.
		f1.startTime = System.currentTimeMillis();

		for (long i = 0; i < 7_000_000_000L; i++) {

		}

		f1.endTime = System.currentTimeMillis();

		System.out.printf("경과시간 : %.3f", f1.getElaspedTime());
	}
}
