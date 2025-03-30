import static sllutil.SllUtil.createSll;
import sllutil.Node;
import static sllutil.SllUtil.printSll;

public class GroupEvenOdd {
  public static Node groupEvenOdd(Node head) {
	Node even = new Node(0);
	Node evenEnd = even;
	Node odd = new Node(0);
	Node oddEnd = odd;
	Node temp = head;
  
	while(temp != null) {
	  if(temp.data % 2 == 0) {
		evenEnd.next = temp;
		evenEnd = temp;
	  } else {
		oddEnd.next = temp;
		oddEnd = temp;
	  }
  
	  Node free = temp;
	  temp = temp.next;
	  free.next = null;
	}
	
	
	evenEnd.next = odd.next;
	return even.next;

  }
  public static void main(String[] args) {
	Node head = createSll(new int[] {1, 3, 5, 2, 4, 6, 7, 8});
  	Node ans = groupEvenOdd(head);
	printSll(ans);	
  }
}
