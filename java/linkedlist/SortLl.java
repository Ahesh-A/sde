import static sllutil.SllUtil.createSll;
import static sllutil.SllUtil.printSll;
import sllutil.Node;

public class SortLl {
  public static Node cutMid(Node head) {
	Node fast = head;
	Node temp = new Node(-1);
	temp.next = head;
	Node slow = temp;

	while(fast != null && fast.next != null) {
	  fast = fast.next.next;
	  slow = slow.next;
	}
	Node ans = slow.next;
	slow.next = null;

	return ans;
  }
  public static Node merge(Node fir, Node sec) {
	Node head = new Node(-1);
	Node temp = head;
	
	while(fir != null && sec != null) {
	  if(fir.data < sec.data) {
		temp.next = fir;
		fir = fir.next;
	  } else {
		temp.next = sec;
		sec = sec.next; 
	  }
	  temp = temp.next;
	}

	if(fir != null) {
	  temp.next = fir;
	}

	if(sec != null) {
	  temp.next = sec;
	}

	return head.next;
  }

  public static Node sort(Node head) {
	if(head == null || head.next == null) {
	  return head;
	}

	Node secondHalf = cutMid(head);
	Node firstHalf = sort(head);
	secondHalf = sort(secondHalf);

	return merge(firstHalf, secondHalf);
  }

  public static void main(String[] args) {
	Node head = createSll(new int[] {1, 0, 1, 0, 0, 1, 1});
//	Node head = createSll(new int[] {1, 7});
//	Node right = cutMid(head);
//	Node ans = merge(head, right);
	//printSll(head);
	Node ans = sort(head);
	printSll(ans);
	//System.out.println();
//	Node ans = sort(head, head, getEnd(head));
//	printSll(ans);	
  }
}



