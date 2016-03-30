package codeforces.round346;

import java.util.*;

/** Created by glebsabirzanov on 31/03/16. */
public class ThirdAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] types = new int[sc.nextInt()];
		int max = sc.nextInt();
		for (int i = 0; i < types.length; i++) {
			types[i] = sc.nextInt();
		}
		int i = 0;
		while (max > 0) {
			i++;
			if (Arrays.binarySearch(types, i) >= 0) {
				continue;
			}
			max -= i;
			if (max >= 0) {
				System.out.print(i + " ");
			} else {
				return;
			}

		}
	}

}
