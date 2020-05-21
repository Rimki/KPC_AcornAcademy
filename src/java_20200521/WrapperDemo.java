package java_20200521;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		/*
		 * 자바 1.4 이전 버전에서는 primitive data type를 collection에 저장할 수 없었기 때문에 primitive data
		 * type를 객체화할 수 있는 wrapper class가 필요함.collection에 1을 저장하기 위해서는 primitive data
		 * type를 객체화할 수 있는 Integer 클래스로 변환해야함.
		 **/
		ArrayList list = new ArrayList();
//		list.add(1);
		list.add(new Integer(1));

//		1. primitive data type => wrapper class (new Integer(1))
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);

//		2. wrapper class => primitive data type (xxxValue())
		int i3 = i1.intValue() + i2.intValue();

//		3. String => primitive data type
		String s1 = "10";
		String s2 = "20";
		int i4 = Integer.parseInt(s1) + Integer.parseInt(s2);

//		4. primitive data type => String
		String s3 = 10 + "";
		String s4 = String.valueOf(10);

//		primitive data type이 자동으로 wrapper class로 변환하는 것을 auto boxing
		Integer i5 = 10;
		Integer i6 = 20;

//		wrapper class가 자동으로 primitive data type으로 변환하는 것을 auto unboxing
		int i7 = i5 + i6;
	}
}
