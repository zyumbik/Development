package contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/** Created by glebsabirzanov on 25/03/16. */
public class StarsOnTheSky {
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {

		String line = "", column = "";
		int n = nextInt(), m = nextInt(), left = n - 1, top = m - 1, bottom = 0, right = 0;

		for (int i = 0; i < n; i++) {
			try {
				line = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			for (int j = 0; j < n; j++) {
				if (line.charAt(j) == '*') {
					if (left > j) {
						left = j;
					}
					if (top > i) {
						top = i;
					}
					if (bottom < i) {
						bottom = i;
					}
					if (right < j) {
						right = j;
					}
				}
				System.out.println(left + " | " + right + " | " + bottom + " | " + top);
			}
		}

		n = right - left + 1;
		m = bottom - top + 1;
		System.out.println(n + " " + m);

		System.out.print(n > m ? n : m);

	}

	static String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	static int nextInt() {
		return Integer.parseInt(next());
	}

}
