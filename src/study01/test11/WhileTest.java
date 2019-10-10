package study01.test11;

import java.util.ArrayList;

public class WhileTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		ArrayList<String> strList = new ArrayList<String>();
		while (strList.size() < 7) {
			strList.add("ㅇㅂㅇ");
			System.out.println(strList);
		}
		do { // 한번은 실행 후 비교
			strList.add("ㅇㅁㅇ");
		}while(strList.size()<7);
	}
}
