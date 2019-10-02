package study01.test07;

public class Cons {
	int num = 5;

	public Cons() {
		System.out.println(num);
		System.out.println("내가 호출?");
	}

	public Cons(int num) {
		System.out.println("num 파라메터 있는 Cons 호출?");
	}

	public static void main(String[] args) {
		Cons c = new Cons(); // 생성자
		System.out.println(c.num);
	}
}
