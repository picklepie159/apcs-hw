public class LLDriver{

    public static void main(String[] args){
	MyLinkedList L = new MyLinkedList();
	
	L.add("A");
	System.out.println(L);
	L.add("B");
	System.out.println(L);
	L.add("C");
	System.out.println(L);
	L.add("D");
	System.out.println(L);
	L.add("E");
      	System.out.println(L);
	L.add(1, "1rd index");
	System.out.println(L);
	//L.add(1, "1st index");
	//L.add(3, "New 3rd");
	System.out.println(L);
	System.out.println(L.get(3));
	System.out.println(L.get(1));
	L.set( 1, "butt");
	L.set( 5, "poop");
	System.out.println(L);
	L.find("poop");
	L.find("pee");
	L.length();
    }
}