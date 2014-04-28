public class BST {
    private Node root;

	private Node current;
    public BST() {
        root = null;
    }

	public void insert(Node n){
		if(root == null){
			root = n;
		}
		else{
			current = root;
			while(current != null){
				if(current.getValue() > n.getValue()){
					if(current.getRight() == null){
						break;
						}
						else{
							current = current.getRight();
						}
					}
				else{
					if(current.getLeft() == null){
							break;
							}
						else{
								current = current.getLeft();
							}
					
					}
				}
				if(current.getValue()>n.getValue()){
					current.setRight(n);
					}
				else{
					current.setLeft(n);
					}
				
			}
				
		}

	}
		



