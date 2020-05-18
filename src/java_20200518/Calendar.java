package java_20200518;

public class Calendar {

	private int year;
	private int month;
	private int day;

//	year에 대한 setter 메서드
//	setter 메서드를 이용하여 year를 변경한다.
	public void setYear(int year) {
		this.year = year;
	}

//	year에 대한 getter 메서드
//	getter 메서드를 이용하여 year를 가져온다.
	public int getYear() {
		return year;
	}

//	this : 자기 자신 객체
//	로컬변수와 멤버변수와 구분할 때 사용한다.
	public void set(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getCount() {

		int preYear = year - 1;
		int totalCount = 0;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			monthArray[1] = 29;

		totalCount = preYear * 365 + ((preYear / 4 - preYear / 100 + preYear / 400)) + day;

		for (int i = 0; i < month - 1; i++)
			totalCount += monthArray[i];

		return totalCount;
	}

	public void print() {

		int totalCount = getCount();
		int rest = totalCount % 7;
		String message = null;

		switch (rest) {
		case 1:
			message = "월요일";
			break;
		case 2:
			message = "화요일";
			break;
		case 3:
			message = "수요일";
			break;
		case 4:
			message = "목요일";
			break;
		case 5:
			message = "금요일";
			break;
		case 6:
			message = "토요일";
			break;
		default:
			message = "일요일";
		}

		System.out.println(year + "년 " + month + "월 " + day + "일은 " + message + " 입니다.");
	}

	public static void main(String[] args) {
		Calendar c = new Calendar();
		c.set(2020, 5, 18);
		c.print();
	}
}
