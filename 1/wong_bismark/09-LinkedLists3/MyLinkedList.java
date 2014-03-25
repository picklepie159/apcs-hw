public class MyLinkedList{

    private nodes head;
    private nodes tail;
	
    public MyLinkedList(){
	//	head = null;
		nodes dummy = new nodes("You should never see this");
		nodes dummyTail = new nodes("Tail end: points to last node");
		head = dummy;
		tail = dummyTail;
//		head.setNext(tail);
		//tail.setNext(head);
	}


	
    public void add(String s){

	if(length() == 0){
		head.setNext(new nodes(s));
		}
		else{
	nodes butt = new nodes(s);
	
	nodes now = getNode(length() - 1);
	System.out.println(now);
	now.setNext(butt);

	tail.setNext(butt);
		}
	}
    public nodes getNode(int i){
		nodes now = head.getNext();
	
		for(int j = 0; j < i ; j++){
	    now = now.getNext();
	}
	
        return now;
	}
    
    public String toString(){
	String s;
	s =" " +  head.getNext();
	String stringnow = " ";
	nodes nodeNow = head.getNext().getNext();
	while(nodeNow != null){
	    s = s + " ||| " + nodeNow;
	    nodeNow = nodeNow.getNext();
	
	}
    System.out.println("Tail is pointing to :" + tail.getNext());
	return s;
    }

    public void add(int i, String s){
	 nodes butt = new nodes(s);
	 nodes now = head.getNext();
	 if(i > length()){
		System.out.println("Outtabounds");
		}
		else{
		
	 for(int j = 0; j < i - 1; j++){
	    now = now.getNext();
	}
	
	if(length() == i){
		tail.setNext(butt);
		}
	
	butt.setNext(now.getNext());
	now.setNext(butt);
	
	}
	
	}

    public String get(int i){
	nodes now = head.getNext();

	for(int j = 0; j < i; j++){
	    now = now.getNext();
	}
	
        return now.toString();
    }	

    public String set(int i, String s){
	nodes now = head.getNext();

	for(int j = 0; j < i-1; j++){
	    now = now.getNext();
	}
	String ret = now.getData();
	now.setData(s);
	return ret;
    }

    public String remove(int i){
	nodes now = head.getNext();

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
		nodes now = head.getNext();
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
			nodes now = head.getNext();
			while(now != null){
				now = now.getNext();
				count++;
				}
			//System.out.println(count + " units long");
			return count;
			}
		
			
	
}