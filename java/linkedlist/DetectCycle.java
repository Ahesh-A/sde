import static sllutil.SllUtil.createSll;
import static sllutil.SllUtil.printSll;
import sllutil.Node;

public class DetectCycle {
  public static void connect(Node head, int idx) {
	Node temp = head;
	Node connectionNode = head;

	for(int i = 0; i < idx; i++) {
	  connectionNode = connectionNode.next;
	}
	while(temp.next != null) {
	  temp = temp.next;
	}

	temp.next = connectionNode;
  }
  public static boolean isCycle(Node head) {
	if(head == null || head.next == null) {
	  return false;
	}
	Node fast = head.next.next;
	Node slow = head;

	while(fast != null && fast.next != null && fast != slow) {
	  fast = fast.next.next;
	  slow = slow.next;
	}

	return fast == slow;
  }
  public static void main(String[] args) {
	Node head = createSll(new int[] {1, 2, 3, 4, 5, 6});
	int idx = 2;
//	connect(head, idx);	
	System.out.println(isCycle(new Node()));
  }
}
