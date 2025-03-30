import static sllutil.SllUtil.createSll;
import static sllutil.SllUtil.printSll;
import sllutil.Node;

public class OnesZeros {
  public static Node sort(Node head) {
	Node zeros = new Node(-1);
	Node ones = new Node(-1);
	Node zidx = zeros;
	Node oidx = ones;

	while(head != null) {
	  Node temp = head;
	  if(head.data == 1) {
		ones.next = head;
		ones = head;
	  } else {
		zeros.next = head;
		zeros = head;
	  }
	  head = head.next;
	  temp.next = null;
	}
//	printSll(oidx);
//	printSll(zidx);
	zeros.next = oidx.next;

	return zidx.next;
  }
  public static void main(String[] args) {
	Node head = createSll(new int[]{1, 0, 0, 1, 1, 0, 0});
	Node ans = sort(head);
	printSll(ans);
  }
}
