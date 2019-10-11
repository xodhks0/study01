package study01.test12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class LibTest {
	static String lefePad(int length, String targetStr) {
		int max = length - targetStr.length();
		for (int i = 1; i <= max; i++) {
			targetStr = "0" + targetStr;
		}
		return targetStr;
	}

	public static void main(String[] args) {
		List<String> ages = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.println("나이를 입력해주세요.");
			String age = scan.nextLine();
			age = StringUtils.leftPad(age, 3,"0");
			ages.add(age);
		}
		Collections.sort(ages);
		for (int i = 0; i < ages.size(); i++) {
			System.out.println(ages.get(i));
		}
	}
}
