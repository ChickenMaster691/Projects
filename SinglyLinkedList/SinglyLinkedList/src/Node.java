public class Node {
	
	int numb;
	
	// Our "Pointer" (reference) Node.
	Node next;

	Node(){};

	Node (int numb){
		this.numb = numb;
	}

	Node(int numb, Node next){
		this.numb = numb; 
		this.next = next; 
	}
	
	public void setNext(Node node) {
		next = node;
	}

}