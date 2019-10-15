package study01.test14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("이름","홍길동");
		map.put("나이","33");
		map.put("성별","남자");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key =it.next();
			System.out.println("key: "+ key+", value : " +map.get(key));
		}
		List<HashMap<String,String>> mapList = new ArrayList<HashMap<String, String>>();
		mapList.add(map);
		System.out.println(mapList);
		//List<List<HashMap<String,String>>> mapListMapList;
		//HashMap<String,List<List<HashMap<String,String>>>> totalMap;
	}
}
