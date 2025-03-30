import static sllutil.SllUtil.createSll;
import static sllutil.SllUtil.printSll;
import sllutil.Node;

public class ReverseByK {
  public static void reverse(Node start, Node end) {
	Node prev = start;
	Node curr = start.next;
	Node nxt = start.next.next;

	while(curr != end) {
	  curr.next = prev;
	  prev = curr;
	  curr = nxt;
	  if(nxt != null) {
		nxt = nxt.next;
	  }
	}
	
	start.next.next = end;
	start.next = prev;
  }
   public static Node reverseByK(Node head, int k) {
	Node start = new Node(-1, head);
	Node first = start;
	Node root = start;
	head = start;

	while(head != null) {
	  for(int i = 0; i < k && head != null; i++) {
		head = head.next;
	  }
	  if(start != null && head != null) {
		Node temp = start.next;
		reverse(start, head.next);
		head = temp;
		start = temp;
	  }
	  printSll(root);
	}
	return first.next;
  }
  public static void main(String[] args) {
	Node head = createSll(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
	int k = 3;
	reverseByK(head, 3);
//	printSll(head);
  }
}
