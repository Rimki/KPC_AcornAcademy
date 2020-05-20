package java_20200520;

public class SubDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s1 = new Super();
		System.out.println(s1.age);
		s1.playBadook();
		s1.work();

		Sub s2 = new Sub();
//		자기 자신
		System.out.println(s2.height);
		s2.playGame();
		s2.work();
//		부모
		s2.age = 20;
		System.out.println(s2.age);
		s2.playBadook();

//		Super s3 = new Sub();
		Super s3 = s2;
		System.out.println(s3.age);
		s3.playBadook();
		s3.work();

	}

}
