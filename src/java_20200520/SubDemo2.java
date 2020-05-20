package java_20200520;

public class SubDemo2 {
	
	public static void change(Super sup) {
		sup.age = 20;
		sup.playBadook();
		sup.work();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s1 = new Sub();
		System.out.println(s1.age);
		
		change(s1);
		
		System.out.println(s1.age);
	}

}
