package study01.test09;

public class ObjectTest {

	int num1;
	static int num2; // 이태릭체 = static

	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		ot.num1 = 10;
		System.out.println(ot.num1);
		System.out.println(num2);
		num2 = 3;
		System.out.println(num2);
		System.out.println(ObjectTest.num2);
		
		

	}
}
