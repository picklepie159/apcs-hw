public class Driver{

    public static void main(String[] args){
	nodes n1;
	n1 = new nodes("TOmmypoop");
	System.out.println(n1);
	nodes n2 = new nodes("Sammypoop");
	System.out.println(n2);
	n1.setNext(n2);
	//The getnext gets n2, prints out n2
	System.out.println(n1.getNext());

	n2.setNext( new nodes ("ClydePoop"));
	
	System.out.println(n1.getNext().getNext());
	System.out.println(n2.getNext());
	
	//	n1.setNext(n2.getNext());
	n1.setNext(n1.getNext().getNext());// Sets n1 to Clydepoop
		//	n1.setNext(n2.getNext());
	System.out.println("Remover nodes 2");
	System.out.println(n1);
	System.out.println(n1.getNext());
	n1.getNext().setNext(n2);
	System.out.println(n1.getNext().getNext());
	
	nodes last;
	last = n1.getNext().getNext();
	last.setNext(n1);

	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	System.out.println(n1.getNext().getNext().getNext());
	System.out.println(n1.getNext().getNext().getNext().getNext());
    }

}