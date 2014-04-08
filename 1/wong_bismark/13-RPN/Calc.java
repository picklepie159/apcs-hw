import java.util.*;

public class Calc{

    MyStack2 butt = new MyStack2();

    Scanner scan = new Scanner(System.in);
    boolean finished = false;

    public Calc(){
	
    }

    public void Driver(){
	System.out.println("Enter stuff");
	//String poop = scan.nextLine();
	while(!finished){
	String poop = scan.nextLine();
	
	if(poop.equals("+") || poop.equals("-")||poop.equals("*")||poop.equals("/")){
	    if(poop.equals("+")){
			Double wun = Double.parseDouble(butt.pop());
			System.out.print(wun + " + ");
			Double too = Double.parseDouble(butt.pop());
			System.out.println(too);
			Double sum = wun + too;
			System.out.println(sum);
			String retur = String.valueOf(sum);
			butt.push(retur);
			System.out.println(butt.toString());
			//finished = true;
	    }
	    else if(poop.equals("-")){
			Double wun = Double.parseDouble(butt.pop());
			System.out.print(wun + " - ");
			Double too = Double.parseDouble(butt.pop());
			System.out.println(too);
			Double sum = wun - too;
			System.out.println(sum);
			String retur = String.valueOf(sum);
			butt.push(retur);
			System.out.println(butt.toString());
			//finished = true;
	    }
	    else if(poop.equals( "*")){
		Double wun = Double.parseDouble(butt.pop());
			System.out.print(wun + " * ");
			Double too = Double.parseDouble(butt.pop());
			System.out.println(too);
			Double sum = wun * too;
			System.out.println(sum);
			String retur = String.valueOf(sum);
			butt.push(retur);
			System.out.println(butt.toString());
			//finished = true;
	    }
	    else if(poop.equals("/")){
			Double wun = Double.parseDouble(butt.pop());
			System.out.print(wun + " / ");
			Double too = Double.parseDouble(butt.pop());
			System.out.println(too);
			Double sum = wun / too;
			System.out.println(sum);
			String retur = String.valueOf(sum);
			butt.push(retur);
			System.out.println(butt.toString());
			//finished = true;
	    }
		}
		
	else{
		butt.push(poop);
		butt.toString();
		}
		}
	}
	
	public static void main(String[] args){
		Calc poop = new Calc();
		poop.Driver();
	}
}
    //read input as String, with scanner

    //if input is +, -, *, / or any other operation(pop twice, calc, and push)

    //otherwise push

    //use Double.parseDouble(_+

    //    or Integer.parseInt()

    //to convert crap