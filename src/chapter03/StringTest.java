package chapter03;

public class StringTest {

	public static void main(String[] args) {
		
	//  \t가 탭을 하라는 명령으로 적용되어 c:	emp로 출력
	//	\r : 원래 \n은 그냥 밑으로 떨어지는거고 \r이 맨 앞으로 땡겨주는 역할이라 \r\n으로 써야하는데 윈도우에서는 자동으로 지원해주니 신경 쓸 필요 없다
		String s = "c:\temp";	
		System.out.println(s);
		
	
	//	\\로 슬래쉬 표현	
		String a1 = "c:\\temp";
		System.out.println(a1);

	//	"hello"로 출력하기 위해 \" \" 사용	
		String s1 = "\"hello\"";
		System.out.println(s1);
		
		char c = '\'';
		System.out.println(c);
		
		
		System.out.print("hello\tworld\r\n");
		System.out.println("==============");
	}

}
