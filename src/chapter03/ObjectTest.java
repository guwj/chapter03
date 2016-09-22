package chapter03;

public class ObjectTest {

	public static void main(String[] args) {
		Point p = new Point();

		System.out.println(p.getClass().getName());	//클래스 정보에서 클래스 이름 출력
		System.out.println(p.hashCode());			//참조값 x, 주소 x, 주소를 기반으로 만든 int형 해싱 값
		System.out.println(System.identityHashCode(p)); // hashCode 내의 내용이 이와 같아서 같은 결과값 출력
		System.out.println(p.toString());			//클래스 정보에서 클래스 이름 출력하고 + @ +hashCode값을 16진수로 나타낸다
		System.out.println(p);						//println에 객체가 들어오면 자동으로 toString을 호출하는 것이다
	}

}
