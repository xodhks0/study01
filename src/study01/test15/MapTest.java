package study01.test15;
//키가 중요할때 map을 사용한다. 그래서 map은 순서가 없다.
//순서가 중요할 때 ArrayList를 사용한다
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
		Map<String,String>map = new HashMap<String,String>(); //implements를 받았다, index개념이 아니다.
		map.put("보물1호","컴퓨터"); //한번에 모든 key , value를 받고 싶을때 for문을 써도 불가능 index구조가 아님
		map.put("보물2호","컴퓨터"); //key 값 따로 value값 따로 저장되있는곳이 다르고 key랑value랑 연결만 되어있을뿐이다
		map.put("해야할일","숙제");

		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) { // is, has가 들어가면 return타입은 무조건 boolean이다.
			String key = it.next();
			System.out.println("key :" + key);
			String value = map.get(key);
			System.out.println("value :" + map.get(key));
		}
		System.out.println(map.get("보물1호")==map.get("보물2호")); //true가 나온다.
		System.out.println(map.get("해야할일"));
		System.out.println(map); //개발할때는 이런식으로 쓸 이유가 없다. 
	
	}

}
