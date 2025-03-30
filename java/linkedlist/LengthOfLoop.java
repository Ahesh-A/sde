import static sllutil.SllUtil.createSll;
import sllutil.Node;
import java.util.Set;
import java.util.HashSet;

public class LengthOfLoop {
  public static void createLoop(Node head, int idx) {
	Node temp = head;
	while(temp.next != null) {
	  temp = temp .next;
	}
	Node connect = head;
	for(int i = 0; i < idx; i++) {
	  connect = connect.next;
	}	

	temp.next = connect;
  }
  public static int findLength(Node head) {
	Set<Node> set = new HashSet<>();
	int count = 0;
	Node temp = head;
	while(!set.contains(temp)) {
	  set.add(temp);
	  temp = temp.next;
	}
	Node start = temp;
	do {
	  count++;
	  temp = temp.next;
	} while(start != temp);
	return count;
  }
  public static int findLengthOfLoop(Node head) {
	Node fast = head;
	Node slow = head;
	int count = 0;

	while(fast != null && fast.next != null){
	  fast = fast.next.next;
	  slow = slow.next;
	  count++;
	  if(fast == slow) {
		return count;
	  } 
	}

	return -1;
  }
  public static void main(String[] args) {
	int idx = 3;
	Node head = createSll(new int[] {1, 2, 3, 4, 5, 6, 7});
	createLoop(head, idx);
	System.out.println(findLength(head));
  }
}
