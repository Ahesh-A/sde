import static sllutil.SllUtil.createSll;
import sllutil.Node;

public class FindElement {
  public static boolean isPresent(Node head, int elem) {
	while(head != null) {
	  if(head.data == elem) {
		return true;
	  }
	  head = head.next;
	}

	return false;
  }
  public static void main(String[] args) {
	Node head = createSll(new int[] {1, 2, 3, 4, 7});
	System.out.println(isPresent(head, 6));
  }
}
