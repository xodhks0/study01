package study01.test11;

import java.util.ArrayList;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		int[] a = new int[3];
		ArrayList<String> array = new ArrayList<String>();
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100);
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) {
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
				}
			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
