package java_20200518;

public class MemberDemo {
	public static void main(String[] args) {
		Member m = new Member();
		m.setName("김기훈");
		m.setZipcode("01234");
		m.setAddr1("서울");
		m.setAddr2("동작구");
		m.setSsn1("111111");
		m.setSsn2("1111118");
		m.setAge(27);
		m.setRegdate("2020-05-18");

		System.out.println(m.getName());
		System.out.println(m.getZipcode());
		System.out.println(m.getAddr1());
		System.out.println(m.getAddr2());
		System.out.println(m.getSsn1());
		System.out.println(m.getSsn2());
		System.out.println(m.getAge());
		System.out.println(m.getRegdate());

	}
}
