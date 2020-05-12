package java_20200512;

public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte 범위를 넘어가면 에러 발생
//		형변환을 하면 에러가 발생하지 않고, circuit 발생
		byte a = (byte)128;
		System.out.println(a);
		
//		float,double 값을 정수형으로 캐스팅하면 소수점 이하가 잘림
//		cut 발생
		int b = (int)42.5;
		System.out.println(b);
		
	}

}
