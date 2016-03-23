/**
 * Created by glebsabirzanov on 27/02/16.
 */
public class FirstTwoLastTwo {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 100000; i <= 999999; i++) {
			if (isSumEqual(i)) {
				count++;
			}
		}
		System.out.print(count);
	}

	public static boolean isSumEqual(int a) {
		if (((a % 10) + ((a % 100) / 10) - ((a / 100000) + (a / 10000) % 10)) == 0) {
			System.out.println(a);
			return true;
		}
		return false;
	}
}
