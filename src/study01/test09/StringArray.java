package study01.test09;

import java.util.ArrayList;
import java.util.Random;

public class StringArray {

	public static void main(String[] args) {
		String[] strs = new String[10];
		// 입력부
		Random ran = new Random();
		for (int i = 0; i < strs.length; i++) {
			int rNum = ran.nextInt(20) + 1;
			strs[i] = rNum + "";
			for (int j = i - 1; j >= 0; j--) {
				if (strs[i] == strs[j]) {
					i--;
					break;
				}
			}
		}
		// 출력부
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
			
		}
		String[] strss = new String[0];
		strss = new String[1];
		strss[0] = "abcdef";
		ArrayList<String> strList = new ArrayList<String>(); // 유동적으로 크기조절 가능 - 배열과 반대(배열은 지정해준 크기로 고정)
		strList.add("1");
		strList.add("2");
		strList.remove(1);
		System.out.println(strList);
		
		String str = "ABCD";
		System.out.println(str.indexOf("C"));
		
		
	}
}
