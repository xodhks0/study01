package exam;

class Father {
	static int a = 3;
	static {
		System.out.println(5);
	}
	Father() {
		System.out.println(1);
	}
}

public class Constructor extends Father {
	Constructor() {
//		super(); 생략되어있음
		System.out.println(3);
	}

	public static void main(String[] args) {
		Father f = new Father();
		f.a=10;
		new Father();
		new Father();
		Father f1 = new Father();
		System.out.println(f1.a);
	}
}
