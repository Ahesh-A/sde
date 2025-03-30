import static sllutil.SllUtil.createSll;
import static sllutil.SllUtil.printSll;
import sllutil.Node;

public class AddLl {
  public static Node add(Node first, Node second) {
	Node temp = new Node(-1);
	Node ans = temp;

	int carr = 0;
	while(first != null && second != null) {
	  int data = first.data + second.data + carr;
	  carr = 0;
	  if(data >= 10) {
		data = data % 10 ;
		carr = 1;
	  }
	  temp.next = new Node(data);
	  temp = temp.next;
	  first = first.next;
	  second = second.next;
	}
	//printSll(ans);
	while(first != null) {
	  int data = first.data + carr;
	  carr = 0;
	  if(data >= 10) {
		data = data % 10;
		carr = 1;
	  }
	  temp.next = new Node(data);
	  temp = temp.next;
	  first = first.next;
	}

	while(second != null) {
	  int data = second.data + carr;
	  carr = 0;
	  if(data >= 10) {
		data = data % 10;
		carr = 1;
	  }
	  temp.next = new Node(data);
	  temp = temp.next;
	  second = second.next;
	}

	if(carr != 0) {
	  temp.next = new Node(carr);
	}
	return ans.next;
  }
  public static void main(String[] args) {
	Node first = createSll(new int[]{9, 9, 9, 9});
	Node second = createSll(new int[] {1, 4, 5});

	Node temp = add(first, second);
	printSll(temp);
  }
}
