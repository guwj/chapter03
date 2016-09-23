package chapter03;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("고길동");
		
		while(stack.empty() == false){
			String s = stack.pop();
			System.out.println(s);
		}
		
		//stacl.pop()	-> StackEmptyException 발생
		stack.push("도우너");
		stack.push("흰둥이");
		stack.push("또치");
		
		System.out.println(stack.pop());	// pop()은 출력하고 stack에서 그 데이터를 삭제
		System.out.println(stack.peek());	// peek()은 출력해도 stackd에 그대로 있음
		System.out.println(stack.pop());
		
	}

}
