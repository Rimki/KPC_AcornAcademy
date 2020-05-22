package java_homework;

public class Homework_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		숙제: 1부터 100까지의 소수구하기

		int num;
		boolean isPrime = false;

		for (num = 2; num <= 100; num++) {
			isPrime = true;

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(num);
			}

		}
	}
}
