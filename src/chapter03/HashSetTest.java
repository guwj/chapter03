package chapter03;

import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("둘리");
		set.add("마이콜");
		set.add("고길동");
		
		System.out.println(set.contains("둘리"));		//set은 값을 출력하지 못하고 set에 이 값이 있는지 contain을 통해 확인할 수는 있다
		System.out.println(set.size());
		
		System.out.println("둘리");
		System.out.println(set.size());	//중복된 데이터는 들어가지 않는다는 것을 알 수 있다
		
		
		set.remove("마이콜");
		
		//순회
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
	}

}
