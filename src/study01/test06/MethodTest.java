package study01.test06;

public class MethodTest {

	public static void main(String[] args) {
		/*
		 * String str = "123"; // new와 다른 영역에 저장된다. String str3 = "123"; String str1 =
		 * new String("123"); System.out.println("123"); // 123 System.out.println(str);
		 * // 123 System.out.println(str1); // 123 System.out.println("123" == "123");
		 * // true System.out.println(str == "123"); // true System.out.println(str1 ==
		 * "123"); // false <- 값 비교 X 위치 비교 O System.out.println(str == str1); // false
		 * <- 값 비교 X 위치 비교 O
		 * 
		 * System.out.println(str.equals(str1)); // true <- 값 비교 O
		 * 
		 * int a = 2; System.out.println(a == 1); //
		 * 
		 * System.out.println(str==str3);
		 */

		String str = "1234567";
		int idx = str.indexOf("345");
		System.out.println("345은 str의 " + idx + "번자리에 있습니다.");

		String name = "경훈,선호,영현,종서,동민,혜영";
		String[] strs = name.split(",");
		for (int i = 0; i < strs.length; i++) {
			System.out.println("이름 : " + strs[i]);
		}
	}
}
