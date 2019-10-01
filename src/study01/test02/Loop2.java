package study01.test02;

public class Loop2 {
	public static void main(String[] agrs) {
		for (int i = 1; i < 11; i = i + 1) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
