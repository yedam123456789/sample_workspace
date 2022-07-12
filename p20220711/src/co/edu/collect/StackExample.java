package co.edu.collect;

import java.util.Stack;

public class StackExample {
public static void main(String[] args) {
	Stack<String> stack = new Stack<>();{
		stack.push("홍길동");
		stack.push("김인수");
		stack.push("박찬호");
		
		String elem = stack.pop();//요소를 뺴넴
		System.out.println(elem);
		
		elem = stack.peek();
		System.out.println(elem);
		
		elem = stack.pop();
		System.out.println(elem);
		
		if(stack.isEmpty()) {
			System.out.println("스택에 더 요소가 없다");
		}
	}
}
}
