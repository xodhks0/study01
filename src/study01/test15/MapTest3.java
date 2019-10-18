package study01.test15;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest3 {

	public static void main(String[] args) {
		Map<String,String> map= new LinkedHashMap<String,String>(); //거의 안쓰인다. 대부분 Arraylist,HashMap을 많이쓴다.
		map.put("좋아하는 음료수1","커피");
		map.put("좋아하는 음료수2","맥주");
		map.put("좋아하는 음료수3","진로이즈백");
		map.put("좋아하는 음료수4","콜라");
		map.put("좋아하는 음료수5","커피");
		map.put("테스트2","1");
		map.put("테스트1","1");
		map.put("테스트5","1");
		map.put("테스트4","1");
		map.put("테스트3","1");
		//순서가 아니라 LinkedList, 즉 앞뒤를 알고있기때문에 이런식으로 나온다. 연결된 링크를 따라간다 생각하면 된다.
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key" + key + "value" + map.get(key));
		}
		
		
	}
}
