package test1;

import java.util.Stack;

public class StackEx {
	
	public void Ex() {
		Stack<String> stack = new Stack<>();
		
		stack.push("first");     // 요소 푸쉬
		stack.push("second");
		stack.push("third");
		
		System.out.println(stack.pop());
		System.out.println("상태 : "+stack.empty()); // 요소 꺼내기
		
		System.out.println(stack.pop());
		System.out.println("상태 : "+stack.empty());
		
		System.out.println(stack.pop());
		System.out.println("상태 : "+stack.empty());
		
		
	};
	
	
	
	
	
	
	
	
}
