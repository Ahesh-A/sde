import static dllutil.DllUtil.createDll;
import static dllutil.DllUtil.printDll;
import dllutil.DlNode;

public class Delete {
  public static DlNode delete(DlNode head, int idx) {
	DlNode temp = head;
	if(idx == 0) {
	  temp = head.next;
	  temp.prev = null;
	  head.next = null;
	  return temp;
	}
	for(int i = 0; i < idx &&  temp != null; i++) {
	  temp = temp.next;
	}
	  
	if(temp == null) {
	  return head;
	}	
	
	temp.prev.next = temp.next;
	if(temp.next != null) {
		temp.next.prev = temp.prev;
		temp.next = null;
	}
	temp.prev = null;

	return head;
  } 
  public static void main(String[] args) {
	DlNode head = createDll(new int[] {1, 2, 3, 4, 5});
	DlNode n = delete(head, 90);

	printDll(n);
  }
}
