package exam;

class Mother {
	int a = 3;
	Mother() {
		System.out.println("이거 실행");
	}
	public void test(int a) {
		System.out.println("엄마꺼");
	}
}

public class MethodTest extends Mother {
	int a = 123;
	MethodTest() {
		System.out.println("이것도 실행");
	}
	public void test(int a) {
		System.out.println("아들꺼");
	}

	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		Mother mtr = new MethodTest();
		System.out.println(mt.a);
	}
}
