package pt.com.everis.academia.java.Second;

import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
	Stack ok = new Stack();
	ok.push(1);
	ok.push(2);
	ok.push(3);
	
	System.out.println(ok);
	System.out.println(ok.peek());
	System.out.println(ok.pop());
	System.out.println(ok);
	
	}
}
