package contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/** Created by glebsabirzanov on 25/03/16. */
public class VasyaMarks {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		int giftQuantity = 0, markQuantity = sc.nextInt();
		for (int j = 0, k = 0; k < markQuantity; k++) {
			if (sc.nextInt() < 4) {
				j = 0;
				continue;
			}
			j++;
			if (j == 3) {
				giftQuantity++;
				j = 0;
			}
		}
		System.out.print(giftQuantity);
	}
}

class MyScanner {
	BufferedReader br;
	StringTokenizer st;

	public MyScanner() {
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