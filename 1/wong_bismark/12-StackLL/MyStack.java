public class MyStack{

    //constructor 1
    private Node top;
    
    private int numElts;

    public MyStack(){
	top = null;
    }
    //push 2
    public void push(String s){
	Node n = new Node(s);
	n.setNext(top);
	top = n;

	numElts++;
    }
    //pop
    public String pop(){
	String s = top.getData();
	
	top = top.getNext();

	numElts--;

	return s;
    }
    //peek

    public String peek(){
	return top.getData();
    }

    //isEmpty
    public boolean isEmpty(){
	return top == null;
    }

    //getSize
    public int getSize(){
	return numElts;
    }

    //toString 3
    public String toString(){
	String tmp = "";
	Node currentNode = top;
	while (currentNode != null){
	    tmp += currentNode.getData() + " , ";
	    currentNode = currentNode.getNext();

	}
	return tmp;
    }
}