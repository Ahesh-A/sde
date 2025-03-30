import static sllutil.SllUtil.createSll;
import sllutil.Node;

public class Palindrome {
  public static Node reverse(Node head) {
	if(head.next == null) {
	  return head;
	}
	Node ans = reverse(head.next);
	head.next.next = head;
	head.next = null;

	return ans;
  }
  public static boolean isPalindrome(Node head) {
	Node reverse = reverse(head);
	Node headPtr= head;
	Node revPtr = reverse;

	while(headPtr != null) {
	  if(headPtr.data != revPtr.data) {
		return false;
	  }
	  headPtr = headPtr.next;
	  revPtr = revPtr.next;
	}

	return true;
  }
  public static void main(String[] args) {
	Node head = createSll(new int[] {1, 2, 3, 2, 1});
	System.out.println(isPalindrome(head));	
  }
}
