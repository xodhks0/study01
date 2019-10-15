package study01.test14;
class End {
	final void test() {
		System.out.println("End의 test method");
	}
}
public class Start /*extends String - 안됨 String은 final로 선언되있음*/ {
	static final String STR_EXAM = "Abc"; // final은 class와 method에만 들어갈 수 있다. overriding 안됨. 재정의를 원치 않을때 final을 사용함
	public static void main(String[] args) {
		
	}
}
