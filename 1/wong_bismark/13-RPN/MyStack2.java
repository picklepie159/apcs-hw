public class MyStack2{

    //constructor 1
    private int top;
    
    private int numElts;
	
	private String[] butt;

    public MyStack2(){
	
		butt = new String[10];
		top = -1;
		numElts = 0;
		
	}
    
	//expansion fucntion
	
	public void bigCopy(){
		String[] temp = new String[butt.length * 2];
		for(int i = 0; i < butt.length; i++){
			temp[i] = butt[i];
		}
		
		butt = temp;
	}
	//push

	
    public void push(String s){
		top++;
		if(numElts >= butt.length){
			bigCopy();
		}
		butt[top] = s;
		

		numElts++;
    }
    //pop
    public String pop(){
		String s = butt[top];
		butt[top] = null;
		top--;

		numElts--;

	return s;
    }
    //peek

    public String peek(){
		return butt[top];
    }

    //isEmpty
    public boolean isEmpty(){	
		return top == -1;
    }

    //getSize
    public int getSize(){
		return numElts;
    }

    //toString 3
    public String toString(){
		String tmp = "";
		int temp = top;
		while (top >= 0 ){
			tmp += butt[top] + " , ";
			top--;

		}
		top = temp;
		return tmp;
    }
}