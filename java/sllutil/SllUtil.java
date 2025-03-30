package sllutil;

public class SllUtil {
  public static Node createSll(int[] arr) {
	Node head = new Node(0);
	Node temp = head;
	
	for(int i : arr) {
	  Node tempNode = new Node(i);
	  temp.next = tempNode;
	  temp = tempNode;
	}

	return head.next;
  }

  public static void printSll(Node head) {
	Node temp = head;
	while(temp != null) {
	  System.out.println(temp.data);
	  temp = temp.next;
	}
  }
  public static Node createChildLl(int[] arr) {
	Node head = new Node(-1);
	Node temp = head;

	for(int i : arr) {
	  temp.child = new Node(i);
	  temp = temp.child;
	}

	return head.child;
  }
  public static void printChildLl(Node head) {
	while(head != null) {
	  System.out.println(head.data);
	  head = head.child;
	}
  }
}
