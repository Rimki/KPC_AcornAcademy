package java_20200513;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
			if (i == 5)
				break;
		}
		System.out.printf("1부터 5까지의 합은 %d입니다.\n", sum);

		/*if(true)
			return;*/
		outter: for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i == 5 && j == 6)
					break outter;
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}

}
