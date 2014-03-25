public class nodes{

    private String data;
    private nodes next;


    public nodes(String s){
	data = s;
    }

    public void setData(String s){
	data = s;
    }
    public String getData(){
	return data;
    }

    public void setNext(nodes n){
	next = n;
    }

    public nodes getNext(){
	return next;
    }		
    
    public String toString(){
	return data;// + "  Next:" + next;
	//	return data;
    }
}