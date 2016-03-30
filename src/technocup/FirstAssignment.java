package technocup;

import java.util.*;

/** Created by glebsabirzanov on 26/03/16. */
public class FirstAssignment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[sc.nextInt()];
		int[] pow = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[i] == 0) {
				continue;
			}
			pow[i] = 0;
			while ((double) a[i] / Math.pow(2, pow[i]) == a[i] / (int)Math.pow(2, pow[i])) {
				pow[i]++;
			}
			pow[i]--;
		}
		int temp = 0;
		for (int i = 0; i < pow.length; i++) {
			if (pow[i] > temp) {
				temp = pow[i];
			}
		}
		System.out.println((int)Math.pow(2, temp));
		int quantity = 0;
		for (int i = 0; i < a.length; i++) {
			if (temp == 0) {
				quantity = a.length;
				break;
			}
			if (a[i] / Math.pow(2, temp) == a[i] / (int) Math.pow(2, temp)) {
				quantity++;
			}
		}
		System.out.println(quantity);

		sc.close();
	}
}
