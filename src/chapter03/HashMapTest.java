package chapter03;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); 
		
		map.put( "one", new Integer(1));
		map.put( "two", 2);	// 기본형 int 2가 아닌 auto boxing이 일어난 것이다
		map.put( "three", 3);
		
		Integer i = map.get("two");
		System.out.println(i);
		
		map.remove("two");
		System.out.println(map.get("two"));
		
		//순회
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String key = it.next();
			Integer v = map.get(key);
			System.out.println(v);
		}
	}

}
