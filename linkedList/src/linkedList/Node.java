package linkedList;

public class Node {
	public int data;
	public Node next;
	public Node previous;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
		this.previous = null;
	}
	
	public void printNode() {
		System.out.println(this.data);
	}
}
