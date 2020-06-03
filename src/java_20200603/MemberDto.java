package java_20200603;

public class MemberDto {
//  Member 테이블의 데이터를 관리하기 위한 클래스
//	Member 테이블의 컬럼을 멤버 변수로 정하면 됨
//	DTO : Date Transfer Object
	private int num;
	private String name;
	private String addr;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}

	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
