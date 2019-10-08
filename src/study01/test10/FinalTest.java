package study01.test10;

class FF {

}

public class FinalTest extends FF {
	final int num = 1; // final 변수는 초기화까지 해주어야한다. 고정

	public static void main(String[] args) {
		int num = 3;
		String str = "num은 3이 맞습니다.";
		if (num != 3) {
			str = "num은 3이 아닙니다.";
		}
		str = (num == 3) ? "num은 3이 맞습니다." : "num은 3이 아닙니다.";
		System.out.println(str);
		System.out.println(str instanceof String);
		
		FinalTest ft = new FinalTest();
		System.out.println(ft instanceof FinalTest);
		System.out.println(ft instanceof FF);
		System.out.println(ft instanceof Object);
		FF ff = new FinalTest();
		System.out.println(ft instanceof FinalTest);
		ff = new FF();
		System.out.println(ft instanceof FinalTest);
	}
}
