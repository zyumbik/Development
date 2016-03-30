package codeforces.round346;

import java.util.*;

/** Created by glebsabirzanov on 31/03/16. */
public class SecondAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pplqty = sc.nextInt(), rgqty = sc.nextInt();
		String[][] surnames = new String[pplqty][rgqty + 1];
		int[][] points = new int[pplqty][rgqty + 1]; // 0 - region, 1 - points
		for (int i = 0; i < pplqty; i++) {
			points[i][0] = i;
			String surname = sc.next();
			int currentrg = sc.nextInt();
			surnames[i][currentrg] = surname;
			points[i][currentrg] = sc.nextInt();
		}
		for (int i = 1; i < points.length; i++) {
			Arrays.sort(points);
			for (int j = 0; j < points[0].length; j++) {
				System.out.print(points[i][j] + " ");
			}
			System.out.println();
		}
	}

}
