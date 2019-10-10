package study01.test11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> human = new HashMap<String, String>();
		human.put("이름", "홍길동");
		human.put("나이", "33");
		human.put("주소", "서울 강서구");
		human.put("성별", "남자");
		human.put("성별", "여자");
		System.out.println(human.get("이름"));
		System.out.println(human);
		List<HashMap<String, String>> people = new ArrayList<HashMap<String, String>>();

		people.add(human);
		people.add(human);
		human = new HashMap<String, String>();
//		human.put("이름", "김길동");
//		people.get(1).put("이름","김길동");
		System.out.println(human);
		System.out.println(people.get(0));
		System.out.println(people);
	}
}
