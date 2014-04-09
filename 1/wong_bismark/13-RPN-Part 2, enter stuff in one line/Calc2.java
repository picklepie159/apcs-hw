import java.util.*;

public class Calc2{

    MyStack2 butt = new MyStack2();

    Scanner scan = new Scanner(System.in);
    boolean finished = false;

	Double d1= 0.0;
	Double d2= 0.0;
    public Calc2(){

    }

    public String read(String s){
	String[] array = s.split(" ");
	for(int i = 0; i < array.length; i++){
		
	    String input = array[i];
		
		System.out.println(input);
		if(input.equals("+")||input.equals("-")||input.equals("*")||input.equals("/")){
			//System.out.println("poop");
			d1 = Double.parseDouble(butt.pop());
			
			d2 = Double.parseDouble(butt.pop());
			System.out.println(d1 + " , " + d2 + " are being operated on");
		}
		
		//if(input.equals("clear"){
			
		
	    if(input.equals("+")){
			//System.out.println("test");
			//butt.pop();
			butt.push(String.valueOf(d1 + d2));
			}
		else if( input.equals("-")){
			//butt.pop();
			butt.push(String.valueOf(d2-d1));
			}
	    else if (input.equals("*")){
			//butt.pop();	
			butt.push(String.valueOf(d2*d1));
			}
	    else if (input.equals("/")){
			//butt.pop();
			butt.push(String.valueOf(d2/d1));
			}

	    else{
		butt.push(input);
		System.out.println(butt.toString());
			}
		
		}
	return butt.peek();
    }
	
	
    public static void main(String[] args){
	Scanner scoop = new Scanner(System.in);
	Calc2 poop = new Calc2();
	System.out.print("Enter something: ");
	String input = scoop.nextLine();
	System.out.println(poop.read(input));
	System.out.println(poop.butt.toString());
    }
}