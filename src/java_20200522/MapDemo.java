package java_20200522;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap : key 값은 유일해야하고, value는 객체를 저장하는데 중복허용
//		1. 선언 및 생성
		HashMap<String, Integer> map = new HashMap<String, Integer>();

//		2. 할당
		map.put("1", 1111);
		map.put("2", 2222);
		map.put("3", 3333);
		map.put("4", 4444);
		map.put("1", 5555);

//		3. 출력
		Integer value = map.get("1");
		System.out.println(value);

//		4. 모두 출력
		Set<String> keySet = map.keySet();
		Iterator<String> i = keySet.iterator();
		while (i.hasNext()) {
			String key = i.next();
			Integer v = map.get(key);
			System.out.printf("키 : %s, 값: %d \n", key, v);
		}
	}

}
