import static sllutil.SllUtil.createSll;
import sllutil.Node;
import java.util.Set;
import java.util.HashSet;

public class StartLoop {
  public static Node findStartOfLoop(Node head) {
	Node temp = new Node(0, head);
	Node slow = head;
	Node fast = head;

	do {
	  slow = slow.next;
	  fast = fast.next.next;
	 // System.out.println(slow.data);
	 // System.out.println(fast.data);
	} while(slow != fast);

	System.out.println(slow.data);
	slow = head;
	while(slow != fast) {
	  slow = slow.next;
	  fast = fast.next;
	  System.out.println(slow.data + " " + fast.data);
	}

	return slow;
  }
  public static void createLoop(Node head, int idx) {
	Node last = head;
	while(last.next != null) {
	  last = last.next;
	}
	Node temp = head;
	for(int i = 0; i < idx; i++) {
	  temp = temp.next;
	}

	last.next = temp;
  }
  public static Node findStart(Node head) {
	Set<Node> set = new HashSet<>();
	
	Node temp = head;
	while(temp != null) {
	  if(!set.contains(temp)){
		set.add(temp);
		temp = temp.next;
	  } else {
		break;
	  }
	}

	return temp;
  }
  public static void main(String[] args) {
	Node head = createSll(new int[] {1, 2, 3, 4, 5, 6});
	createLoop(head, 1);
	//Node start = findStart(head);
	Node intersect = findStartOfLoop(head);
	System.out.println(intersect.data);
  }
}
