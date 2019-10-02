package study01.test07;

import java.util.Scanner;

class Calc2 {
	int num1;
	int num2;
	String execute;
	String text;

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
		for (int i = 1;; i++) {
			System.out.println(i + "번째 " + "사칙연산 프로그램입니다.");
			Scanner scan = new Scanner(System.in);
			System.out.println("첫번째 수 입력");
			calc2.num1 = scan.nextInt();
			System.out.println("두번째 수 입력");
			calc2.num2 = scan.nextInt();
			System.out.println("계산할 수식 +, -, *, /를 입력");
			calc2.execute = scan.next();
			if (calc2.execute.contentEquals("+")) {
				calc2.add();
			} else if (calc2.execute.contentEquals("-")) {
				calc2.minus();
			} else if (calc2.execute.contentEquals("*")) {
				calc2.multiple();
			} else if (calc2.execute.contentEquals("/")) {
				calc2.division();
			} else {
				System.out.println("잘못된 수식을 입력하였습니다.");
			}
			System.out.println("사칙연산 프로그램을 종료하시겠습니까? (Y/N)");
			calc2.text = scan.next();
					if (calc2.text.contentEquals("Y") || calc2.text.contentEquals("y")) {
						System.out.println("종료합니다.");
						System.exit(0);
					} else if (calc2.text.contentEquals("N") || calc2.text.contentEquals("n")) {
						continue;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요. (Y/N)");
						calc2.text = scan.next();
				}
			}
		}

	}

