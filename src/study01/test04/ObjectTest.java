package study01.test04;

//import java.util.Random;

public class ObjectTest { // 멤버변수는 JAVA에서 자동으로 초기화 시켜줌
	int age;
	String name;
	//Random r;
	String getStr() {
		return null;
	}
	
	public static void main(String[] args) {
		ObjectTest objectTest = new ObjectTest(); // 초기화
		objectTest.age = 10;
		System.out.println(objectTest.age);
		System.out.println(objectTest.name);
		// System.out.println(objectTest.r.nextInt()); // runtime exception
		// System.out.println(objectTest.r);
	}
}


/* 접근제어자
 * public    - 접근 제어 안함 
 * default   - 접근 제어 중간
 * private   - 접근 제어 심함 
 * protected - default + 상속 
 */