package java_20200520.step4;

public class StopMilliWatch {

//	밀리세컨드를 관리하기 위한 변수
	long startTime;
	long endTime;

//	밀리세컨드의 경과시간
	private double getElaspedTime() {
		return (double) (endTime - startTime) / 1000;
	}

//	밀리세컨드의 시작시간
	private void start() {
		startTime = System.currentTimeMillis();
	}

//	밀리세컨드의 종료시간
	private void stop() {
		endTime = System.currentTimeMillis();
	}

	public void execute() {
		start();
		for (long i = 0; i < 7_000_000_000L; i++) {

		}
		stop();

		double elapsedTime = getElaspedTime();

		System.out.printf("경과시간 : %.3f", elapsedTime);
	}

}
