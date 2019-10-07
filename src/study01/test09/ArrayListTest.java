package study01.test09;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList<String> strList = new ArrayList<String>();
		strList.add("홍길동");
		strList.add("임꺽정");
		strList.add("이문수");
		strList.add("김문수");

		System.out.println("우리반 출석부");
		for (int i = 0; i < strList.size(); i++) {
			System.out.println((i) + ". " + strList.get(i));
		}
		System.out.println("박문수는 " + strList.indexOf("박문수") + "번째 있어요!");
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		System.out.println(numList);
	}
}
