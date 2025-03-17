import static sllutil.SllUtil.createSll;
import sllutil.Node;

public class FindMiddle {
  public static Node findMiddle(Node head) {
	Node fast = head;
	Node slow = head;

	while(fast != null && fast.next != null) {
	  fast = fast.next.next;
	  slow = slow.next;
	}

	return slow;
  }
  public static void main(String[] args) {
	Node head = createSll(new int[] {1, 2, 3, 4, 5, 6});
	Node middle = findMiddle(head);
	System.out.println(middle.data);	
  }
}

