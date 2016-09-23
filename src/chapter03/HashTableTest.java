package chapter03;

import java.util.*;

public class HashTableTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();	// <key값, Value값>

		map.put("one", new Integer(1));
		map.put("two", 2); // 기본형 int 2가 아닌 auto boxing이 일어난 것이다
		map.put("three", 3);

		Integer i = map.get("two");
		System.out.println(i);

		map.remove("two");
		System.out.println(map.get("two"));
		
		//같은 key값을 중복하여 사용하면 Value를 새로 덮어씌워진다
		map.put("one", 10);
		System.out.println(map.get("one"));
	}

}
