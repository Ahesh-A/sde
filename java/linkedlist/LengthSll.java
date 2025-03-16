import static sllutil.SllUtil.createSll; 
import sllutil.Node;

public class LengthSll {
  public static int getLength(Node head) {
	int count = 0;
	Node temp = head;

	while(temp != null) {
	  temp = temp.next;
	  count ++;
	}

	return count;
  }

  public static void main(String[] args) {
	Node head = createSll(new int[] {1, 2, 3, 4, 5});
	System.out.println(getLength(head));	
  }
}
