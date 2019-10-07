package study01.test09;

import java.util.Scanner;

import study01.test08.Atom;

public class Inherit extends Atom {
	static void test(Object i) {
		
	}
	public String toString() {
		return "메모리 주소 찍지마!";
	}
	public static void main(String[] args) {
		test("asdf");
		Inherit i = new Inherit();
//		i.privateTest(); 오류 - 본인 클래스만 사용가능
//		i.defaultTest(); 오류 - 패키지가 다름
//		i.protectedTest(); 가능 - 상속받아서 가능
//		i.publicTest(); 가능 - 당연히 가능
		System.out.println(i);
		Object o = new Inherit();
		System.out.println(new Inherit());
		Object obj = 1;
		obj = "1";
		obj = true;
		obj = new Scanner(System.in);
		obj = new Atom();
		obj = new Inherit();
		
	}

}
