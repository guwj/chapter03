package chapter03;

public class StringTest3 {
	public static void main(String args[]) {
		String s1 = "hello";
		String s2 = "hello";

		String s3 = new String("hello");
		String s4 = new String("hello");

		System.out.println(s1 == s2); // 이 부부이 true로 나오는 이유는 s1에서 "hello"가
									  // constant pool(상수 풀)에 해쉬코드로 등록이 되어 있다가
									  // s2가 같은 "hello"를 입력하니까 s1에서 입력된 것을 그대로 가져다 줬기 때문이다
		System.out.println(s3 == s4);
	}
}
