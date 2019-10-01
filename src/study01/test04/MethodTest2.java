package study01.test04;

public class MethodTest2 {

	static void test() { //void <- 아무것도 리턴하지 않겠다라는 뜻
		System.out.println(1);
	} // Method 선언

	static int getNum() {
		return 0;
	}
	
	public static void main(String[] args) {
		test(); // Method 호출
		int a = getNum(); // 가능
		//getNum() = a; // 불가능
		
	}
}
