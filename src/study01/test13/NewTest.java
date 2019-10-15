package study01.test13;

public class NewTest {
	

	public static void main(String[] args) {
		String[] strs = new String[3];
		strs[0] = "123";
		strs[1] = "asd";
		strs[2] = "ㅁㄴㅇ";
		
		String str = "[";
		for (int i = 0; i < strs.length; i++) {
			str += strs[i] + ",";
		}
		str = str.substring(0, str.length() - 1);
		str += "]";
		System.out.println(str);


		String test = "12345";
		System.out.println(test.substring(1));
		System.out.println("12345".indexOf("3"));
		test = test.substring(2);
		System.out.println(test);
		test = test.substring(0, 1);
		System.out.println(test);

	}
}
