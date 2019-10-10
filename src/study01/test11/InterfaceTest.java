package study01.test11;

interface Promise { // 접근제어자를 선언하지않으면 default가 아니라 public임
	public int test();

	void test1();

}

public class InterfaceTest implements Promise { // 반드시 Overriding 해야함
	public int test() {
		return 1;
	}

	public void test(int a) {

	}

	public void test1() {

	}

}
