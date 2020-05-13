package java_20200513;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i == 6)
				continue;
			sum += i;
		}
		System.out.printf("1부터 10까지의 합은 %d입니다.(단, 6은 제외한다.)\n", sum);

		outter: for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (j == 5)
					continue outter;
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}

}
