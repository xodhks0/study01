package study01.test06;

import java.util.Scanner;

public class ScanTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("실수 입력");
		String d = scan.nextLine();
		System.out.println(d);
		
		System.out.println("나이입력"); // Enter키 입력
		String ageStr = scan.nextLine();
		int age = Integer.parseInt(ageStr); // 형 변환
		System.out.println("너의 나이");
		System.out.println(age);
	}
}
