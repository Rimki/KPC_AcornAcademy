package java_20200522;

public class StringMethodDemo {
	public static void main(String[] args) {
		String ssn = "111111-1111118";
//		charAt(int index) : 문자열중에서 특정 index에 있는 문자를 반환
		char c = ssn.charAt(6);
		System.out.println(c);

//		concat(String msg) : 문자열 연결
		ssn = ssn.concat("abcd");
		System.out.println(ssn);

//		endsWith(String msg) : msg 문자열로 끝나면 true,or false
		String fileName = "abcd.doc";
		if (fileName.endsWith("doc")) {
			System.out.println("워드문서입니다.");
		} else if (fileName.endsWith("zip")) {
			System.out.println("압축파일입니다.");
		} else
			System.out.println("파일입니다");

//		startsWith(String msg) : msg 문자열로 시작하면 true,or false
		String url = "https://www.naver.com";
		String path = "/news/ssss.do?id=123";
		if (path.startsWith("/news")) {
			System.out.println("뉴스 페이지입니다.");
		} else if (path.startsWith("/sport")) {
			System.out.println("스포츠 페이지입니다.");
		} else
			System.out.println("페이지가 존재하지 않습니다.");

//		equalsIgnoreCase(String msg) : 대소문자를 구분하지 않고 문자열을 비교하여 같으면 true
		boolean success = fileName.equalsIgnoreCase("abcd.DOC");
		System.out.println(success);

//		indexOf(String msg) : msg 문자열의 위치를 반환
		int index = ssn.indexOf("-");
		System.out.println(index);

//		lastIndexOf(String msg) : msg 문자열의 위치
		fileName = "abc.abc.abc.abc.doc";
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));

//		배열의 길이 : length, 문자열의 길이 : length()
//		trim() : 앞뒤 공백문자 제거
		String dbId = "rimki".trim();
		String userId = "rimki ".trim();
		System.out.println(dbId);
		System.out.println(userId);
		System.out.println(dbId.length());
		System.out.println(userId.length());
		System.out.println(dbId.equals(userId));
		System.out.println(dbId.equalsIgnoreCase(userId));
		System.out.println(dbId == userId);

//		substring(int first, int last) : fisrt(포함)부터 second(포함x) 사이의 문자열을 추출
//		substring(int first) : first(포함)보다 큰 모든 문자열을 추출
		fileName = "abc.abc.abc.doc";
		String first = fileName.substring(0, fileName.lastIndexOf("."));
		String last = fileName.substring(fileName.lastIndexOf(".") + 1);
		System.out.println(first);
		System.out.println(last);

//		replaceAll(String first, String second) : first 문자열을 second 문자열로 대체
		String html = "안녕하세요\n저는 김기훈입니다.\n 잘 부탁 드립니다.";
		html = html.replaceAll("\n", "<br>");
		System.out.println(html);

//		toUpperCase() : 대문자로 변환
		String m1 = "hello";
		m1 = m1.toUpperCase();
		System.out.println(m1);

//		toLowerCase() : 소문자로 변환
		m1 = m1.toLowerCase();
		System.out.println(m1);

//		String.valueOf(~) : primitive data type을 문자열로 변환
		char[] c1 = { 'a', 'b', 'c' };
		String msg = String.valueOf(c1);
		System.out.println(msg);

//		split(String msg) : msg를 기준으로 문자열을 분리하여 배열에 저장
		String[] str = ssn.split("-");
		System.out.println(str[0]);
		System.out.println(str[1]);

		String str2 = String.format("%,.2f",123.4567);
		System.out.println(str2);
		
		str2 = String.format("%3$,20.2f%n %2$,20.2f%n %1$,20.2f%n",1234.4590,123345.5680,34234.5690);
		System.out.println(str2);
	}
}
