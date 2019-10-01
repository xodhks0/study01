package study01.test04;

public class MethodTest {
//class는 영역안에 없어도 되지만 변수와 Method는 영역(class) 안에 있어야 한다.
	static int num = 1;

	static int num() {
		return 1;
	}

	// System.out.println(num); <- 오류, class 하위에는 변수 선언만 가능
	public static void main(String[] args) {
		// int, double, for, while, if 등을 예약어라고 한다. 예약어가 아닌 것들 중 ()가 있으면 Method라 한다.
		System.out.println(num);

	}
}
