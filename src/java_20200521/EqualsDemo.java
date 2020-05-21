package java_20200521;

public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("abc");
		String s2 = new String("abc");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		Customer c1 = new Customer("김기훈", "제주도");
		Customer c2 = new Customer("김기훈", "제주도");

		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1);
	}

}
