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
}
