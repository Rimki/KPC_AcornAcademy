package java_20200512;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 달력만들기 1. 1년 1월 1일 월요일 2. 1년은 365일이고, 윤년일때는 366일 (2월 29일) 3. 윤년은 4년마다 발생하고,
		 * 그중의 100배수는 제외하고, 400배수는 제외하지 않는다. 4. 2020년 5월 12일은 무슨 요일일까? 5. 2019년까지 총 일수 +
		 * 4월까지 총 일수 + 12 더해서 7로 나눈 나머지가 1이면 월요일, 2이면 화요일,...
		 */

//		(2019*365 + ((2019/4-2019/100+2019/400)+31+29+31+30+12)%7

		int year = 2019;
		int month = 5;
		int day = 12;
		int totalCount = 0;
		int rest = 0;
		String message = null;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			monthArray[1] = 29;
		}

		totalCount = year * 365 + ((year / 4 - year / 100 + year / 400)) + day;

		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i];
		}
		rest = totalCount % 7;

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

		System.out.println((year + 1) + "년 " + month + "월 " + day + "일은 " + message + " 입니다.");
	}
}
