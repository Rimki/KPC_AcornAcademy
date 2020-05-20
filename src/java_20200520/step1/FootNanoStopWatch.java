package java_20200520.step1;

public class FootNanoStopWatch {

	long startTime;
	long endTime;

	long startNanoTime;
	long endNanoTime;

	public double getElaspedTime() {
		return (double) (endTime - startTime) / 1000;
	}

	public double getElaspedNanoTime() {
		return (double) (endNanoTime - startNanoTime) / 1000000000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FootNanoStopWatch f1 = new FootNanoStopWatch();
		f1.startNanoTime = System.nanoTime();

		for (long i = 0; i < 7_000_000_000L; i++) {

		}
		
		f1.endNanoTime = System.nanoTime();
		
		double elapsedTime = f1.getElaspedNanoTime();
		System.out.printf("경과시간 : %.9f",elapsedTime);
	}

}
