package java_20200513;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		int j = 1;
		while (i <= 10) {
			sum += i;
			i++;
		}

		System.out.printf("1부터 10까지의 합은 %d입니다.\n", sum);

		i = 2;

		while (i < 10) {
			while (j < 10) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
				j++;
			}
			i++;
			j = 1;
		}

	}

}
