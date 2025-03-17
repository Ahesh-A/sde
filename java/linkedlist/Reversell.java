import static sllutil.SllUtil.createSll;
import static sllutil.SllUtil.printSll;
import sllutil.Node;

public class Reversell {
  public static Node reverseList(Node node) {
	if(node.next == null) {
	  return node;
	}

	Node head = reverseList(node.next);
	node.next.next = node;
	node.next = null;
	return head;
  }
  public static Node reverse(Node head) {
	Node prev = null;
	Node curr = head;
	Node forward = head.next;

	while(curr != null) {
	  curr.next = prev;
	  prev = curr;
	  curr = forward;
	  if(forward != null) {
		forward = forward.next;
	  }
	}

	return prev;
  }
  public static void main(String[] args) {
	Node head = createSll(new int[] {1, 2, 3, 4, 5, 6});
	head = reverseList(head);
	printSll(head);
  }
}
