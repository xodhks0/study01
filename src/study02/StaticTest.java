package study02;

public class StaticTest {
	final static int a; //static으로 창조되어있는 건 모두 자바머릿속안에 있다. main하기전에 자바 메모리로 올라가기 때문
	static { // 같은 static영역이기 때문에 final을 사용할 수 있다. 
				// 필요할때마다 하는걸 lazyloding 이라고 한다.freeloading
		a = 10;
	}
	public static void main(String[] args) {
		System.out.println(StaticTest.a);

	}
}
