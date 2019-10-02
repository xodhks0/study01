package study01.test07;

public class ArrayTest {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		String[] strs = new String[5]; // string 공간 5개 확보
		for(int i=0;i<strs.length;i++) {
			strs[i] = "" + (i+1) * 10;
		}
		for(int i=0; i<strs.length;i++) {
			System.out.println(strs[i]);
		}
		System.out.println("프로그램 종료");
	}
}
