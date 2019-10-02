package study01.test07;

import java.util.Scanner;

class Calc2 {
	int num1;
	int num2;

	public void add() {
		System.out.println(num1 + num2);
	}

	public void minus() {
		System.out.println(num1 - num2);
	}

	public void multiple() {
		System.out.println(num1 * num2);
	}

	public void division() {
		System.out.println(num1 / num2);
	}
}

//public class Execute2 {
//	public static void main(String[] args) {
//		Calc2 calc2 = new Calc2();
//		calc2.num1 = 5;
//		calc2.num2 = 3;
//		calc2.add();
//		calc2.minus();
//		calc2.multiple();
//		calc2.division();
//	}
//
//}

public class Execute2 {
	public static void main(String[] args) {
		Calc2 calc2 = new Calc2();
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 수 입력");
		int num1 = scan.nextInt();
		System.out.println("두번째 수 입력");
		int num2 = scan.nextInt();
		calc2.add();
		calc2.minus();
		calc2.multiple();
		calc2.division();
	}
}
