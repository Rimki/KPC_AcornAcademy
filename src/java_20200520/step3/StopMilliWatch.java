package java_20200520.step3;

public class StopMilliWatch {

//	밀리세컨드를 관리하기 위한 변수
	long startTime;
	long endTime;

//	밀리세컨드의 경과시간
	public double getElaspedTime() {
		return (double) (endTime - startTime) / 1000;
	}

//	밀리세컨드의 시작시간
	public void start() {
		startTime = System.currentTimeMillis();
	}

//	밀리세컨드의 종료시간
	public void stop() {
		endTime = System.currentTimeMillis();
	}

}
