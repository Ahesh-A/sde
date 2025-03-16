import dllutil.DlNode;
import static dllutil.DllUtil.createDll;
import static dllutil.DllUtil.printDll ;

public class Insert {
  public static DlNode insert(DlNode head, int idx, DlNode node) {
	if(idx < 0) {
	  return head;
	}		
	
	if(idx == 0) {
	  node.next = head;
	  head.prev = node;

	  return node;
	}

	DlNode temp = head;
	DlNode p = head;
	for(int i = 0; i < idx && temp != null; i++) {
	  p = temp;
	  temp = temp.next;
	}

	if(temp == null) {
	  p.next = node;
	  node.prev = p;
	  return head;
	}
	node.prev = temp.prev;
	temp.prev.next = node;
	node.next = temp;
	temp.prev = node;

	return head;
  }

  public static void main(String[] args) {
	DlNode head = createDll(new int[] {1, 2, 3, 4, 5});
	DlNode n = insert(head, 5, new DlNode(6));
	printDll(n);
  }
}
