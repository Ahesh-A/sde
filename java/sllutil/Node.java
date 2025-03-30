package sllutil;
public class Node {
  public int data;
  public Node next;
  public Node child;
  public Node rand;

  public Node(int data, Node next, Node child) {
	this.data = data;
	this.next = next;
	this.child = child;
  }
  public Node(int data) {
	this.data = data;
  }
}
