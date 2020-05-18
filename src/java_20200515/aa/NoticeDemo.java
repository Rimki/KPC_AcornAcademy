package java_20200515.aa;

public class NoticeDemo {
	public static void main(String[] args) {
		Notice n1 = new Notice();
		n1.number = 1;//public
		n1.title = "제목";//protected
		n1.hit = 100;//default
		//같은 패키지에 있더라도 private 접근 한정자는 접근할 수 없다.
		//private 접근 지정자는 같은 클래스 내에서만 접근 가능.
		//n1.regdate = "2020-05-15";//private
	}
}
