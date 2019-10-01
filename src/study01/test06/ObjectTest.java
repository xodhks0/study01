package study01.test06;

public class ObjectTest {
	int num1;
	int num2;

	public static void main(String[] args) {
		ObjectTest objectTest = new ObjectTest();
		objectTest.num1 = 5;
		objectTest.num2 = 10;
		System.out.println(objectTest.num1);
		System.out.println(objectTest.num2);
		objectTest = new ObjectTest();
		System.out.println(objectTest.num1);
		System.out.println(objectTest.num2);
		
	}
}
