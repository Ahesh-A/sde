import static sllutil.SllUtil.createSll;
import static sllutil.SllUtil.printSll;
import sllutil.Node;

public class RotateLl {
  public static int getLength(Node head) {
	int count = 0;

	while(head != null) {
	  head = head.next;
	  count++;
	}

	return count;
  } 

  public static Node rotate(Node head, int k) {
	Node kthLastNode = head;
	Node temp = head;
	Node tail = null;
	Node kthLastNodeTail = null;
	int count = getLength(head);
	k = k % count;

	for(int i = 1; i <= k && temp != null; i++) {
	  temp = temp.next;
	}

	if(k == 0) {
	  return head;
	}

	while(temp != null) {
	  tail = temp;
	  temp = temp.next;
	  kthLastNodeTail = kthLastNode;
	  kthLastNode = kthLastNode.next;
	}
	kthLastNodeTail.next = null;
	tail.next = head;
	
	return kthLastNode;
  }

  public static void main(String[] args) {
	Node head = createSll(new int[] {1, 2, 3, 4, 5, 6});
	int k = 1;
	head = rotate(head, k);
	printSll(head);
  }
}
