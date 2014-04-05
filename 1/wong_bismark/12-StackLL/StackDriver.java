public class StackDriver{

    public static void main(String[] args){
	MyStack stack = new MyStack();
	stack.push("1");
	stack.push("2");
	stack.push("3");
	System.out.println(stack);
	while(!(stack.isEmpty())){
	System.out.println(stack.pop());
	}
	
	stack.push("hello");
	System.out.println(stack.peek());
	stack.push("world");		
	System.out.println(stack.peek());
	stack.push("two");
	System.out.println(stack);



    }

}