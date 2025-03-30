import static dllutil.DllUtil.createDll;
import static dllutil.DllUtil.printDll;
import dllutil.DlNode;

public class RemoveDuplicates {
  public static void removeNode(DlNode node) {
	  node.prev.next = node.next;
	  node.next.prev = node.prev;
	  node.next = null;
	  node.prev = null;
  }

  public static DlNode removeDuplicates(DlNode head) {
	DlNode first = new DlNode(-1, null, head);
  
	while(head != null) {
	  if(head.next != null && head.data == head.next.data) {
		DlNode temp = head.next;
		removeNode(head);
		head = temp;
	  } else {
		head = head.next;
	  }
	}

	return first.next;
  }
  public static void main(String[] args) {
	DlNode head = createDll(new int[]{ 1, 1, 2, 2, 2, 2, 3, 4, 5, 6, 6});
	head = removeDuplicates(head);
	printDll(head);

  }
}
