package java8;
import java.util.*;

public class Stream1 {
	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<>();
		stack.push(2);
		stack.push(6);
		stack.push(4);
		stack.push(9);
		stack.push(7);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.size());
	
		System.out.println("stack"+stack);
		
	}

}
