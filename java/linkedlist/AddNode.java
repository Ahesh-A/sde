import sllutil.SllUtil;
import sllutil.Node;

public class AddNode {
  public static void addNode(Node head, Node node) {
	Node temp = head;

	while(temp.next != null) {
	  temp = temp.next;
	}

	temp.next = node;
  }
  public static void main(String[] args) {
	Node head = SllUtil.createSll(new int[] {1, 2, 3, 4, 5});
	Node node = new Node(6);
	addNode(head, node);
	SllUtil.printSll(head);
  }
}
