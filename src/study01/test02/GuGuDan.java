package study01.test02;

public class GuGuDan {
	public static void main(String[] agrs) {
		for (int num = 1; num < 10; num = num + 1) {
			for (int i = 1; i < 10; i = i + 1) {
				System.out.print(num + "X" + i + "=" + (num * i));
				if (i != 9) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
}
