package java_20200518;

public class StaticMethodDemo {

	String name;
	static double interestRate;

	public void m1() {
//		instance 메서드에서는 instance 변수, static 변수 모두 사용가능
//		instance 메서드에서는 instance 메서드, static 메서드 모두 호출가능
		this.name = "김기훈"; // this 자기 자신 객체
		StaticMethodDemo.interestRate = 4.2;
		this.m2();
		StaticMethodDemo.m4();
	}

	public void m2() {
		System.out.println("m2() 인스턴스 메서드 호출");
	}

	public static void m3() {
//		static 메서드에서는 static 변수만 사용가능, instance 변수 사용불가
//		static 메서드에서는 static 메서드만 호출가능, instance 메서드 호출불가
//		static 메서드에서는 this를 사용할 수 없음.

//		name = "홍길동";
		StaticMethodDemo.interestRate = 3.9;
//		m2();
		StaticMethodDemo.m4();

//		static 메서드에서 instance 변수와 instance 메서드를 호출하려면 객체를 생성해서 사용

		StaticMethodDemo m1 = new StaticMethodDemo();
		m1.name = "홍길동";
		m1.m2();

	}

	public static void m4() {
		System.out.println("m4() static 메서드 호출");
	}

	public static void main(String[] args) {
		StaticMethodDemo.m4();
		StaticMethodDemo.m3();
		StaticMethodDemo.interestRate = 4.3;

		StaticMethodDemo m = new StaticMethodDemo();
		m.m1();
		m.m2();
		m.name = "손정의";
	}
}
