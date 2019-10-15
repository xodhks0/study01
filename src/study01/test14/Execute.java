package study01.test14;

// 디버깅 해볼것!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
import java.util.ArrayList;
import java.util.List;

public class Execute {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("김태완");
		p.setAge(27);
		p.setAddr("인천");
		List<Person> pList = new ArrayList<Person>();
		pList.add(p);
		p = new Person();
		p.setName("하늘");
		p.setAge(24);
		p.setAddr("인천");
		pList.add(p);
		p = pList.get(0);
		p = pList.get(1);
		p.setName("재빈");

		System.out.println(pList);
		System.out.println(pList.get(0));
		System.out.println(pList.get(1));
	}
}
