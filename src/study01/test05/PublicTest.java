package study01.test05;

// 같은 패키지에 위치해 있으면 import하지 않아도 되지만 다른 패키지에 위치해 있으면 import 해야함 (default는 같은 패키지 내에서만 import 가능)

import study01.test04.PrivateTest;

public class PublicTest {
	public int num;
	public static void main(String[] args) {
		PublicTest publicTest = new PublicTest();
		System.out.println(publicTest.num);
		PrivateTest privateTest = new PrivateTest();
		System.out.println(privateTest.num);
		
		
	}
}
