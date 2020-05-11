package java_20200511;

public class CharacterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 유니코드 표현 => '\u0000'
		char c1 = '\uAE40';
		char c2 = '\uAE30';
		char c3 = '\uD6C8';
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		
//		2. 아스키코드 표현
//		48 - 57 => 0 - 9
//		65 - 90 => A - Z
//		97 - 122 => a - z
		
		char c4 = 97;
		System.out.println(c4);
		
//		3. 문자 표현법
		char c5 = '성';
		System.out.println(c5);
		
		char c6 = '\'';
		char c7 = '"';
		
		
	}

}
