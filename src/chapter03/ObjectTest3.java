package chapter03;

public class ObjectTest3 {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		Point p3 = p2;
		
		// == -> 두 객체의 동일성
		System.out.println(p1 == p2);	// p1과 p2가 가리키는 객체가 같은지 -> false
		System.out.println(p2 == p3);	// p2와 p3가 가리키는 객체가 같은지 -> true
		
		// equals() -> 두 객체의 동등성(내용 비교)
		System.out.println(p1.equals("hello"));
		System.out.println(p1.equals(p2));		
		System.out.println(p2.equals(p3)); 		
		
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode() + " : " + s2.hashCode());	//String이 자체적으로 hashCode를 override해서 내용을 기반으로 객체 비교
		System.out.println(System.identityHashCode(s1) + " : " + System.identityHashCode(s2));	//	hashCode의 기본형으로 주소 기반으로 객체 비교
		
		String s3 = "ABC";
		String s4 = "ABC";
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}

}

