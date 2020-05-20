package java_20200520.step4;

public class StopWatchDemo {
	public static void run(StopMilliWatch s1) {
		s1.execute();
	}

	public static void run(StopNanoWatch s2) {
		s2.execute();
	}

	public static void main(String[] args) {
		StopNanoWatch s1 = new StopNanoWatch();
		run(s1);
	}
}
