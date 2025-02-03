package test1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	
	
	public void Ex() {
		
		Queue<String> queue = new LinkedList<>();
		String result;
		queue.offer("first");
		queue.offer("second");
		queue.offer("third");
		
		System.out.println("첫번째 : " + queue.peek());
		queue.poll();
		System.out.println("poll 작동");

		result=queue.isEmpty() ? "비어 있음" : "요소있음";
		System.out.println("지금 상태 : " + result);
		System.out.println("두번째 : " + queue.peek());
		queue.poll();
		System.out.println("poll 작동");
		System.out.println("지금 상태 : " + result);		
		result=queue.isEmpty() ? "비어 있음" : "요소있음";
		System.out.println("세번째 : " + queue.peek());
		queue.poll();
		System.out.println("poll 작동");
		
		result=queue.isEmpty() ? "비어 있음" : "요소있음";
		System.out.println("지금 상태 : " + result);
		
		
		
		
		
	};

}
