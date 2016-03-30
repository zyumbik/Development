package technocup;

import java.util.*;

/** Created by glebsabirzanov on 26/03/16. */
public class Floors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
		int ed = sc.nextInt(), girl = sc.nextInt();
		int podEd = (int) Math.ceil(ed / (double)k / m);
		int storeyEd = (int) Math.ceil(ed / (double)k / podEd);
		int podGirl = (int)Math.ceil(girl / (double)k / m);
		int storeyGirl = (int) Math.ceil(girl / (double)k / podGirl);

		int time = 0;

		if(storeyEd * 5 > storeyEd + 10) {
			time += storeyEd + 10;
		} else {
			time += storeyEd * 5;
		}

		if(Math.abs(n - podEd + podGirl) > Math.abs(podGirl - podEd)) {
			time += Math.abs(podGirl - podEd) * 15;
		} else {
			time += Math.abs(n - podEd + podGirl) * 15;
		}

		if(storeyGirl * 5 > storeyGirl + 10) {
			time += storeyGirl + 10;
		} else {
			time += storeyGirl * 5;
		}

		System.out.println(time);

	}
}
