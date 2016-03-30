package itschool;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/** Created by glebsabirzanov on 28/03/16. */
public class ArraySortComparator {

	public static void main(String[] args) {
		Random rnd = new Random();
		Double[] array = new Double[rnd.nextInt(50)];
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextDouble() + rnd.nextInt(100);
		}

		Arrays.sort(array, new Comp());
		for (Double anArray : array) {
			System.out.println(anArray);
		}

	}

	private static class Comp implements Comparator<Double> {
		@Override
		public int compare(Double obj1, Double obj2) {
			int m1 = (int) Math.floor(obj1);
			int m2 = (int) Math.floor(obj2);
			if (m1 < m2) {
				return -1;
			} else if (m1 > m2) {
				return 1;
			} else {
				return 0;
			}
		}
	}

}
