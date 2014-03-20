public class MyLinkedList{

    private nodes head;
    
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

    public int find(String s){
		boolean found = false;
		int count = 0;
		nodes now = head;
		while(!found && now !=null){
			
			if(now.getData().equals(s)){
				found = true;
				break;
			}	
			
			count++;
			now = now.getNext();

		}
		if(!found){
			count = -1;
			}
		System.out.println( s + " was found at " + count);
		return count;
		}	
		
		public int length(){
			int count = 0;
			nodes now = head;
			while(now != null){
				now = now.getNext();
				count++;
				}
			System.out.println(count + " units long");
			return count;
			}
		
			
	
}