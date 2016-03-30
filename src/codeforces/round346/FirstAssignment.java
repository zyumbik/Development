package codeforces.round346;

import java.util.*;

/** Created by glebsabirzanov on 31/03/16. */
public class FirstAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		while (true) {
			if (b < 0) {
				b++;
				if (--a == 0) {
					a = n;
				}
			} else if (b > 0) {
				b--;
				if (a++ == n) {
					a = 1;
				}
			} else {
				System.out.println(a);
				return;
			}
		}
	}

}
