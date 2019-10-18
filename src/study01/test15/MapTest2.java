package study01.test15;

import java.util.HashMap; //안보고 따라해본 클래스
import java.util.Iterator;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("일","1");
		map.put("이","2");
		map.put("삼","3");
		map.put("사","4");
		map.put("오","5");
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " + key);
			String value = map.get(key);
			System.out.println("value :" + map.get(key));
		}
	}
}
