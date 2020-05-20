package java_20200520.step4;

public class StopNanoWatch {

//	나노세컨드를 관리하기 위한 변수
	long startTime;
	long endTime;

//	나노세컨드의 경과시간
	private double getElaspedTime() {
		return (double) (endTime - startTime) / 1000000000;
	}

//	나노세컨드의 시작시간
	private void start() {
		startTime = System.nanoTime();
	}

//	나노세컨드의 종료시간
	private void stop() {
		endTime = System.nanoTime();
	}

	public void execute() {
		start();
		for (long i = 0; i < 7_000_000_000L; i++) {

		}
		stop();

		double elapsedTime = getElaspedTime();

		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
}
