import static sllutil.SllUtil.createSll;
import static sllutil.SllUtil.printSll;
import sllutil.Node;

public class RemoveNthLast {
  public static Node removeNthLast(Node head, int n) {
  
	Node temp = head;
	for(int i = 0; i < n && temp != null; i++) {
	  temp = temp.next;
	}
	if(temp == null) {
	  return head.next;
	}
	Node ptr = head;
	while(temp.next != null) {
	  temp = temp.next;
	  ptr = ptr.next;
	}
	ptr.next = ptr.next.next;
	return head;
  }
  public static void main(String[] args) {
	Node head = createSll(new int[] {1, 2, 3, 4, 5});
	Node ans = removeNthLast(head, 1);
	printSll(ans);
  }
}
