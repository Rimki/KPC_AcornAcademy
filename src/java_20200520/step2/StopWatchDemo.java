package java_20200520.step2;

public class StopWatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopWatch s1 = new StopWatch();
		
		s1.startNano();
		for (long i = 0; i < 7_000_000_000L; i++) {

		}
		s1.stopNano();
		
		double elaspedTime = s1.getElaspedNanoTime();
		System.out.printf("경과시간 : %.9f",elaspedTime);
	}

}
