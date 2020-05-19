package java_20200519;

public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("yhs693", "1111", "yhs693@naver.com", 1);

		/*
		 * a.setId("yhs693"); 
		 * a.setPwd("1111"); 
		 * a.setEmail("yhs693@naver.com");
		 * a.setLevel(1);
		 * 
		 */

		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());

		Admin a1 = new Admin("rimki", "2222", "yhs693@naver.com");

		System.out.println(a1.getId());
		System.out.println(a1.getPwd());
		System.out.println(a1.getEmail());
		

	}
}
