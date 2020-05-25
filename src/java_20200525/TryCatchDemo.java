package java_20200525;

public class TryCatchDemo {
	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);

			double average = getAvg(korean, english);
			System.out.printf("평균 : %f", average);
			
		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("예외 메세지: " + e.getMessage());
//			System.err.println("인자 2개 필요!");
			e.printStackTrace();
			/*
			 * 일반 출력 : System.out 
			 * 에러 출력 : System.err
			 */
		} catch (NumberFormatException e) {
//			System.err.println("예외 메세지: " + e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("finally");
		}
		
//		catch 블럭이 여러 있을 경우 위에서부터 하위 클래스 => 상위 클래스 순으로 정한다.
	}

	public static double getAvg(int first, int second) {
		// TODO Auto-generated method stub
		int sum = first + second;
		double avg = (double) sum / 2;
		return avg;
	}

}
