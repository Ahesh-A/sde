import static sllutil.SllUtil.createSll;
import static sllutil.SllUtil.printSll;
import sllutil.Node;

public class DeleteNode {
  public static Node deleteNode(Node head, int n) {
	if(n < 0) {
	  return head;
	}
	Node first = new Node(0, head);
	Node temp = first;

	for(int i = 0; i < n && temp != null; i++) {
	  temp = temp.next;
	}

	if(temp == null) {
	  first.next = null;
	  return head;
	}
	
	temp.next = temp.next.next;
	Node ans = first.next;
	first.next = null;	
	return ans;
  }
  public static void main(String[] args) {
	Node head = createSll(new int[] {1, 2, 3, 4, 5, 6});
	int idx = 100;
	Node n = deleteNode(head, idx);
	printSll(n);
  }
}
