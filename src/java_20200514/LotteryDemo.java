package java_20200514;

import java.util.Arrays;

public class LotteryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}

		Arrays.sort(lotto);

		for (int value : lotto) {
			System.out.print(value + "\t");
		}
	}

}
