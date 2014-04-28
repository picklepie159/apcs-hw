public class Node{

    private int data;
    private Node right, left;


    public Node(int s){
	data = s;
    }

    public void setData(int s){
	data = s;
    }
    public int getValue(){
		return data;
    }

    public void setRight(Node n){
	right = n;
    }

    public Node getRight(){
		return right;
    }		
	
	public void setLeft(Node n){
		left = n;
	}
	
	public Node getLeft(){
		return left;
	}
    
    public String toString(){
	return "Data: " + data;// + "  Next:" + next;
	//	return data;
    }
}