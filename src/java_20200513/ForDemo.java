package java_20200513;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i <= 10; i++)
			sum += i;

		System.out.printf("1부터 10까지의 합은 %d입니다.\n", sum);

		sum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.printf("1부터 10까지의  짝수 합은 %d입니다.\n", sum);

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}

		for (int i = 9; i > 1; i--) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < 4 - i)
					System.out.print(" ");
				else
					System.out.printf("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.printf("*");
			}
			System.out.println();
		}
	}

}
