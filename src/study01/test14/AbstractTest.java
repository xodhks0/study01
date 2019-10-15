package study01.test14;


class Son extends AbstractTest {

	@Override
	public void test() {
		System.out.println("test");
	}

}



public abstract class AbstractTest {
	// abstract - 추상클래스
	// 상속을 받은 class에서만 new를 할 수 있다.
	public abstract void test();

	public static void main(String[] args) {
		AbstractTest at = new Son();
		at.test();
	}
}
