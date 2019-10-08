package study01.test09;

public class Test {
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			for (int j = 1; j <= 50; j++) {
				if (i == j * 3 || i == j * 7) {
					System.out.println(i);
				}

			}
		}
	}
}
