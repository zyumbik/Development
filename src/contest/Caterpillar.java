package contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/** Created by glebsabirzanov on 25/03/16. */
public class Caterpillar {
	public static void main(String[] args) {
		JustScanner sc = new JustScanner();
		int h1 = sc.nextInt(), h2 = sc.nextInt();
		int a = sc.nextInt(), b = sc.nextInt();
		int days = 0;

		h1 += a * 8;
		h1 -= 12 * b;

		if (a < b){
			days = -1;
		} else if (a >= b) {
			while (h1 < h2) {
				h1 += 12 * a;
				days++;
				if (h1 >= h2) {
					break;
				}
				h1 -= 12 * b;
			}
		}

		System.out.println(days);
	}
}

class JustScanner {
	BufferedReader br;
	StringTokenizer st;

	public JustScanner() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}
}
