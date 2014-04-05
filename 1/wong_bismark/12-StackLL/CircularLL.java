
public class CircularLL<E>{
    private class Node<E>{
	E data;
	Node<E> next, prev;
	public Node(E d){
	    this.data =d;
	}
	public String toString(){
	    return " "+ data;
	}

	public void setData(E d){data = d;}
	public E getData(){return data;}
	
	public void setNext(Node<E> n ){ next = n;}
	public Node<E> getNext(){ return next;}

	public void setPrev(Node<E> p) {prev = p;}
	public Node<E> getPrev() {return prev;}
    }

    private Node<E> current;	   
    private Node<E> end;
    private  Node<E> head;


    public void insert(E d){
	Node<E> n = new Node<E>(d);
	if (current== null){
	    current = n;
	    end = n;
	    current.setPrev(n);
	    end.setNext(current);
	    head = current;
	   
	    //  end = n;
	    //current.setNext(n);
	}
	else if(current.prev ==  current){
	    //System.out.println("path 2");
	    end = current;
	    current = n;
	 
	    head = current;
	    System.out.println("* head " + head);
	    current.setNext(end);
	    current.setPrev(end);
	    
	    end.setNext(current);
	    end.setPrev(current);


	    //	    current.setPrev(current.getNext());
	    //    end = current.getNext();
	}
	else{	
	    Node<E> prevC = current.getPrev();
	    
	    n.setNext(current);
	    n.setPrev(prevC);

	    prevC.setNext(n);
	    
	    current.setPrev(n);

	    current = n;
	    if(current.getNext() == head){
		head = current;
	    }

	    if(current.getPrev() == end && current != head){
		end = current;
	    }

	    /* if(current == head){
		head = n;
		head.setPrev(end);
	    }
	    */	
	    
	    /* if(current == end){
		end = n;
		end.setNext(head);
	    }
	    */
	    // System.out.println(current);
	   


	}
    }
    public E getCurrent(){
	return current.getData();
    }
    
    public void forward(){
	if(current.getNext()!= null)
	    current = current.getNext();
    }
    public void back(){
	if(current.getPrev() != null)
	    current = current.getPrev();
    }
    
    public String toString(){
	int curCount = 0;
	if(current == null)
	    return " ";
	//System.out.println(" * " + current);
 	while(current.getPrev() != end){
	    current = current.getPrev();
	    curCount++;
	}
	Node<E> tmp = current;
	String s = " " ;
	while (tmp != null && tmp != end ){
	s = s+ tmp.getData() + " ";
	tmp = tmp.getNext();
	}
	if(tmp == end){
	    System.out.println("head is " + head);
	    System.out.println("end is " + tmp.getData());
	    s = s + tmp.getData();
	}

       

	for(int i = 0; i < curCount; i++){
	    current = current.getNext();
	}

	System.out.println(head + ":" + end + " : " + end.getNext());
	//	System.out.println("*" + end);
	//System.out.println(end.getNext());
	//	System.out.println(" ^ " + current);
	System.out.print("List:");
    return s;
    }
    
    
    
    
    
    public static void main(String[] args){
	CircularLL<String> L = new CircularLL<String>();
	System.out.println(L);
	//	System.out.println(head + " : " +  end + " : "+ end.getNext());
	L.insert("hello");
	System.out.println(L);
	//	System.out.println(head + " : " +  end + " : "+ end.getNext());
	L.insert("world");
	System.out.println(L);
	//	System.out.println(head + " : " +  end + " : "+ end.getNext());
	L.insert("three");
	System.out.println(L);
	//First test up to here
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.insert("inserted");

	System.out.println(L);
	//System.out.println(head + " : " +  end + " : " + end.getNext());
	//then test again to here
    }
}