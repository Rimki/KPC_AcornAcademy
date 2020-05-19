package java_20200519;

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;

//	디폴드 생성자
	public Admin() {
		super(); // 부모 클래스의 디폴트 생성자를 호출
	}

//	생성자(constructor)는 반환값이 없고, 이름은 클래스 이름과 동일, 역할은 인스턴스 변수 초기화
	public Admin(String id, String pwd, String email, int level) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}

//	생성자의 오버로딩
	public Admin(String id, String pwd, String email) {
		/*
		 * this.id = id; 
		 * this.pwd = pwd; 
		 * this.email = email;
		 */
		this(id, pwd, email, 0); //다른 생성자를 호출, 반드시 생성자에서만 호출가능
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
