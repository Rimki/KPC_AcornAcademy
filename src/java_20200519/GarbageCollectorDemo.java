package java_20200519;

public class GarbageCollectorDemo {
	public static void main(String[] args) {
		Admin a1 = new Admin();
		a1 = new Admin();
		a1 = null;

		a1 = new Admin();
		Admin a2 = a1;
		a1 = null;
		a2 = null;
		
	}
}
