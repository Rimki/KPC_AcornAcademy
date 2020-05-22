package java_20200522;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1 = new StringBuffer("test");
		StringBuffer s2 = new StringBuffer("test");

//		StringBuffer 클래스는 Object의 equals() 메서드를 overrriding 하지 않았기 때문에 
//		Object의 equals() 메서드를 사용한다.
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

//		StringBuffer => String : toString()
		String s3 = s1.toString();
		String s4 = s2.toString();

		System.out.println(s3.equals(s4));

		StringBuffer sql = new StringBuffer();
		sql.append("select name, age ");
		sql.append("from member ");
		sql.append("where name = '김기훈' ");
		sql.append("order by name desc");

		System.out.println(sql);
	}

}
