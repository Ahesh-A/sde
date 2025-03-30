import static sllutil.SllUtil.createSll;
import static sllutil.SllUtil.printSll;
import sllutil.Node;

public class AddOne {
  public static Node reverse(Node head) {
	if(head.next == null) {
	  return head;
	}

	Node ans = reverse(head.next);
	head.next.next = head;
	head.next = null;
	return ans;
  }
  public static void addOne(Node head) {
	int carr = 1;
	Node temp = null;

	while(head != null) {
	  int data = head.data;
	  head.data = (data + carr) % 10;
	  carr = (data + carr) / 10;
	  temp = head;
	  head = head.next;
	}

	if(carr > 0) {
	  temp.next = new Node(carr);
	}

  }
  public static void main(String[] args) {
	Node head = createSll(new int[] {0, 0, 0, 0, 0});
	Node ans = reverse(head);
	//printSll(ans);
	addOne(ans);
	ans = reverse(ans);
	printSll(ans);

  }
}
