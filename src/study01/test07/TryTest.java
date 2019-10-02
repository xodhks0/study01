package study01.test07;

import java.util.Scanner;

public class TryTest {
	static Scanner scan = new Scanner(System.in);

	public static void read() {
		System.out.println("숫자 입력");
		String numStr = scan.nextLine();
		try {
			int num = Integer.parseInt(numStr);
		} catch (NumberFormatException nfe) {
			System.out.println("숫자를 다시 넣어주세요");
			read();
		}
	}

	public static void main(String[] args) {

	}
}
