package t6_Stack_Queue;

import java.util.Stack;

// LIFO 구조
public class T1_Stack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		System.out.println("1. 크기: "+stack.size());
		System.out.println("1. 내용: "+stack);
		System.out.println();
		
		// 자료 삽입(push)
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
		stack.push(6);
		System.out.println("2. 크기: "+stack.size());
		System.out.println("2. 내용: "+stack);
		System.out.println();
		
		// 바로 아래 자료 쳐다보기: peek()
		System.out.println("3. 바로 아래 자료: "+stack.peek());
		System.out.println("3. 크기: "+stack.size());
		System.out.println("3. 내용: "+stack);
		System.out.println();
		
		// 자료 검색: search(): 위에서부터 쳐다봤을 때 순서
		System.out.println("4. "+stack.search(7)+"번째 위치"); // 7은 2번째에 있다
		System.out.println("4. "+stack.search(3)+"번째 위치"); // 3은 3번째에 있다
		System.out.println("4. "+stack.search(6)+"번째 위치"); // 6은 1번째에 있다
		System.out.println("4. "+stack.search(10)+"번째 위치"); // 없으면 -1
		System.out.println();
		
		// 자료 꺼내기(pop)
		System.out.println("5: "+stack.pop());
		System.out.println("5: "+stack.pop());
		System.out.println("5: "+stack.pop());
		System.out.println("5: "+stack.pop());
		System.out.println("5: "+stack.pop());
		
		
		System.out.println("5. 크기: "+stack.size());
		System.out.println("5. 내용: "+stack);
		System.out.println();
		
		// 스택의 내용 공백체크: empty() -> true/false 반환
		System.out.println("5. 내용이 비었나요? "+stack.empty());
	}
}
