package study01.test08;

public class Atom {
	private void privateTest() {
		System.out.println("Atom에서만 쓸 수 있는 method");
	}
	void defaultTest() {
		System.out.println("같은 패키지 안에서만 쓸 수 있는 method");
	}
	protected void protectedTest() {
		System.out.println("같은 패키지와 상속받은 클래스 안에서만 쓸 수 있는 method");
	}
	public void publicTest() {
		System.out.println("누구나 쓸 수 있는 method");
	}
}