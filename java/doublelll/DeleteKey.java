import static dllutil.DllUtil.createDll;
import static dllutil.DllUtil.printDll;
import dllutil.DlNode;

public class DeleteKey {
  public static DlNode remove(DlNode head, int key) {
	DlNode ans = new DlNode(-2, null, head);
	DlNode temp = head;
	DlNode initialPtr = ans;
	//printDll(temp);

	while(temp != null) {
	  while(temp != null && temp.data == key) {
		temp = temp.next;
	  }
	  if(initialPtr.next != temp) {
		initialPtr.next = temp;
	  }
	  initialPtr = temp;
	  if(temp != null) {
		System.out.println(temp.data);
		temp = temp.next;
	  }

	}

	return ans.next; 
  }
  public static void main(String[] args) {
	DlNode head = createDll(new int[] {2, 1, 2, 3, 4, 5, 2, 2});
	int key = 2;
	remove(head, key);
  }
}
