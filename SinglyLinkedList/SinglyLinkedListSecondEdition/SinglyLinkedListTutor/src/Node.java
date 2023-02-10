
public class Node {
	
	int numb; 
	Node next; 
	
	Node(int numb, Node next){
		this.numb = numb; 
		this.next = next; 
	}
	
	public void setNext(Node node) {
		next = node; 
	}

}
