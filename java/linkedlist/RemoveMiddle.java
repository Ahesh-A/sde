import static sllutil.SllUtil.createSll;
import static sllutil.SllUtil.printSll;
import sllutil.Node;

public class RemoveMiddle {
  public static Node removeMiddle(Node head) {
	if(head == null || head.next == null) {
	  return head;
	}
	
	Node fast = head.next.next;
	Node slow = head;

	while(fast != null && fast.next != null) {
	  fast = fast.next.next;
	  slow = slow.next;
	}
	
	slow.next = slow.next.next;
	return head;
  }
  public static void main(String[] args) {
	Node head = createSll(new int[] {1, 2, 3, 4, 5});
	Node ans = removeMiddle(head);
	printSll(ans);
  }
}
