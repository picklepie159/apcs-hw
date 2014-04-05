import java.util.*;
public class MyLinkedList<E> implements Iterable{


  
    private nodes head;
    
    public Iterator<E> iterator(){
	//make and return a new iterator over this linked list
	Iterator<E> it = new myLLIterator<E>(head);
	return it;
    }    
    
    public MyLinkedList(){
	head = null;
    }

    public void add(String s){
	//inserting at front of list
	nodes tmp = new nodes(s);
	tmp.setNext(head);
	head = tmp;
    }

    
    
    public String toString(){
	String s;
	s =" " +  head;
	String stringnow = " ";
	nodes nodeNow = head.getNext();
	while(nodeNow != null){
	    s = s + " ||| " + nodeNow;
	    nodeNow = nodeNow.getNext();
	    //	    stringnow = nodeNow.toString();
	}
    
	return s;
    }

    public void add(int i, String s){
	 nodes butt = new nodes(s);
	 nodes now = head;
	 for(int j = 0; j < i - 1; j++){
	    now = now.getNext();
	}
	
        butt.setNext(now.getNext());
	now.setNext(butt);
    }

    public String get(int i){
	nodes now = head;
	//	System.out.println(head);
	for(int j = 0; j < i; j++){
	    now = now.getNext();
	}
	
        return now.toString();
    }	

    public String set(int i, String s){
	nodes now = head;
	//	System.out.println(head);
	for(int j = 0; j < i; j++){
	    now = now.getNext();
	}
	String ret = now.getData();
	now.setData(s);
	return ret;
    }

    public String remove(int i){
	nodes now = head;

	for(int j = 0; j < i-1; j++){
	    now = now.getNext();
	}
	
	String ret = now.getNext().toString();
	now.setNext(now.getNext().getNext());
	
	return ret;
    }

    
	
}