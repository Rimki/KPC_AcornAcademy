package java_20200514;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.배열선언 및 생성
		int[] a = new int[4];

//		2.배열할당
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;

//		3.배열출력

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
//		배열 선언.생성,할당을 동시에
		int [] b = {100,200,300,400,500};
		
//		배열의 값 변경(할당)
		b[0] = 101;
		b[1] = 201;
		b[2] = 301;
		b[3] = 401;
		b[4] = 501;
		
//		배열출력 => for loop
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
//		배열출력 => enhanced for loop
		for(int temp : b)
			System.out.println(temp);
		
		int[] c = a;
		c[0] = 11;
		
		System.out.println(a[0]);
		System.out.println(c[0]);
		
		
		
	}

}
