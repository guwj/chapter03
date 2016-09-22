package chapter03;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil");
		System.out.println(sb);
		
		sb.insert(7, " my");	// 가운데에 삽입
		System.out.println(sb);
		
		sb.replace(8,  10, "yours");	// 8부터 10까지 교체
		System.out.println(sb);
		
		sb.setLength(3);		// 길이 조절
		System.out.println(sb);
	}

}
