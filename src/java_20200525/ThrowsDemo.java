package java_20200525;

public class ThrowsDemo {

	public static void main(String[] args) {
		try {
			int first = Integer.parseInt(args[0]);
			int second = Integer.parseInt(args[1]);

			int result = getDivide(first, second);
			System.out.printf("결과 : %d" + "\n", result);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("인자를 2개 입력");
		} catch (NumberFormatException e) {
			System.err.println("인자에는 숫자만 입력");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}

	public static int getDivide(int first, int second) {
		// TODO Auto-generated method stub
		int result = first / second;
		return result;
	}
}
