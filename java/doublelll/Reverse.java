import static dllutil.DllUtil.createDll;
import static dllutil.DllUtil.printDll;
import dllutil.DlNode;

public class Reverse {
  public static DlNode reverse(DlNode head) {
	DlNode dumm = new DlNode(100);
	DlNode curr = dumm;
	curr.next = head;
	head.prev = curr;
	curr = head;
	DlNode temp = head.next ;
	DlNode ans = curr;

	while(curr != null) {
	  curr.next = curr.prev;
	  curr.prev = temp;
	  ans = curr;
	  curr = temp;
	  if(temp != null) {
		  temp = temp.next;
	  }
  	}
	dumm.next = null;
	head.next = null;
	return ans;
  }
  public static void main(String[] args) {
	DlNode head = createDll(new int[] {1, 2, 3, 4, 5});
	DlNode node = reverse(head);
	printDll(node);
  }
}
