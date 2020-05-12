package java_20200512;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = Integer.parseInt(args[0]);
		String season = null;
		
		switch(month) {
//		case 평가값 => 반드시 유일해야 함.
//		case 절에 break가 없으면 아래의 case로 이동한다.
		case 12 : 
		case 1 :
		case 2 : season = "겨울"; break;
		case 3 : 
		case 4 : 
		case 5 : season = "봄"; break;
		case 6 : 
		case 7 : 
		case 8 : season = "여름"; break;
		case 9 :
		case 10 : 
		case 11 : season = "가을"; break;
//		default의 위치는 어디 있든 상관없음.
		default : season = "없는 계절";
		}
		
		System.out.println(month+"월은 "+season+"입니다.");
	}

}
