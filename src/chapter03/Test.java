package chapter03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		set.add("또치");
		set.add("둘리");
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(set);
		}
		
	}

}
