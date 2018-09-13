package linkedList;

public class LinkedList {
	public Node first;
	public Node last;
	public int length;
	
	public LinkedList() {
		first = null;
		last = null;
		length = 0;
	}
	
	public void addFirst(Node someNode) {  
		if (first != null) {
			System.out.println("Error.  Please try another function");
		}
		else {
			first = someNode;
			last = someNode;
			length = 1;
		}
	}
	public void addAtFirst(Node someNode) {   
		someNode.next = first;
		Node temp = first;
		temp.previous = someNode;
		first = someNode;
		length++;
	}           
		
	public void push(Node someNode) {   
		Node temp = someNode;
		last.next = temp;
		last = temp;
	}
	
	public void printList() {   
		Node temp = first;
		while (temp != null) {
			temp.printNode();
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		Node james = new Node(5);
		test.addFirst(james);
		Node mom = new Node(6);

		test.printList();
	}
}
