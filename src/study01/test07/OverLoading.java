package study01.test07;

public class OverLoading { //1. 메소드 명이 반드시 같아야 함. 2. 파라메터 갯수가 같아도 됨. 3. 파라메터 형태가 달라도됨. 4. 파라메터 갯수와 형태가 같아도 순서가 달라도됨.

	public void test() {
		System.out.println("test() Method 호출!");
	}
	public void test(int num) {
		System.out.println("test(int num) Method 호출!");
	}
	public void test(String str) {
		System.out.println("test(String str) Method 호출!");
	}
	public void test(String str, int num) {
		System.out.println("test(String str, int num) Method 호출!");
	}
	public void test(int num, String str) {
		System.out.println("test(int num, String str) Method 호출!");
	}
	public static void main(String[] args) {
		OverLoading overLoading = new OverLoading();
		overLoading.test();
		overLoading.test(1);
		overLoading.test("r");
		overLoading.test("r", 1);
		overLoading.test(1, "r");

	}
}
