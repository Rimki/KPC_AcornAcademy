package java_20200521;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(4.2);
		System.out.println(d1);

		d1 = Math.floor(4.9);
		System.out.println(d1);

		long l1 = Math.round(42.5);
		System.out.println(l1);

		d1 = 45.67;
		double d2 = Math.round(d1 * 10d) / 10d;
		System.out.println(d2);

		int a1 = Math.abs(-123);
		System.out.println(a1);

		d1 = Math.sqrt(3);
		System.out.println(d1);

		d1 = Math.pow(2, 3);
		System.out.println(d1);

		d1 = Math.random() * 45;
		System.out.println(d1);
	}
}
