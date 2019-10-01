package study01.test06;

public class ObjectTest2 {
	int num1;
	int num2;
	String str = "";
	String str2 = new String("");

	public static void main(String[] args) {

		ObjectTest2 objectTest = new ObjectTest2();
		ObjectTest2 objectTest2 = new ObjectTest2();
		System.out.println(objectTest.num2 == objectTest2.num1); // true
		System.out.println(objectTest.str == objectTest2.str); // true
		System.out.println(objectTest.str2 == objectTest2.str2); // false
	}
}

// 정해져 있는 변수는 값을 비교할 수 있다.
