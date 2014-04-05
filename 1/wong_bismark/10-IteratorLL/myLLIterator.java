import java.util.*;
public class myLLIterator<E> implements Iterator<E>{
    private nodes currentNode;

    public myLLIterator(nodes n){
	currentNode = n;
    }

    public boolean hasNext(){
	boolean val = true;
	if(currentNode.getNext() == null)
	    {val = false;}
	return val;
	//if we have no dummy node, return currentNode == null
    }

    public E next() {
	E data = (E)currentNode.getData();
	currentNode = currentNode.getNext();
	
	return data;
    }
    
    public void remove(){
	currentNode = currentNode.getNext();
    }

}