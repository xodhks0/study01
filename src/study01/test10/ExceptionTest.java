package study01.test10;

public class ExceptionTest {
	public static void main(String[] args) {
		System.out.println("시작합니다.");
		String strNum = "1234";
		try {
			System.out.println(strNum+ "을 int형으로 바꾸는 작업을 시작합니다.");
			int num = Integer.parseInt(strNum);
			System.out.println(strNum+ "을 int형으로 바꾸는 작업이 끝났습니다.");
		} catch(Exception e) {
			System.out.println(strNum + "(은/는) 숫자가 아닙니다.");
		} finally {
			System.out.println("무조건 실행되는 곳");
		}
		System.out.println("종료합니다.");
	}
}
