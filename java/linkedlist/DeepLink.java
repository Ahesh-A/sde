import static sllutil.SllUtil.createSll;
import static sllutil.SllUtil.printSll;
import sllutil.Node;

public class DeepLink {

  public static void createLink(Node head) {
	while(head != null) {
	  Node temp = new Node(head.data);
	  Node headNxt = head.next;
	  head.next = temp;
	  temp.next = headNxt;
	  head = head.next.next;
	}
  }

  public static void createProblem(Node head) {
	head.next.rand = head;
	head.next.next.rand = head.next.next.next.next;
	head.next.next.next.rand = head.next.next;
	head.next.next.next.next.rand = head;
  }

  public static void referenceRand(Node head) {
	Node temp = head.next;
	while(temp != null && head != null) {
	  if(head.rand != null) {
		temp.rand = head.rand.next;
	  } 

	  head = head.next.next;
	  if(temp.next != null) {
		temp = temp.next.next;
	  }
	}
  }
  public static Node seperateList(Node head) {
	Node ans = new Node(-1);
	Node first = ans;
	Node temp = head;
	
	while(temp != null && temp.next != null) {
//	  System.out.println(temp.data+ " " + temp.next.next.data);
	  ans.next = temp.next;
	  Node tmpNxt = temp.next.next;
	  temp.next = tmpNxt;
	  ans = ans.next;
	  temp = tmpNxt; 
	}
	return first.next;
  }
  
  public static Node deepCopy(Node head) {
	createLink(head);
	referenceRand(head);	
//	test(head);
	return seperateList(head);
  }

  public static void test(Node head) {
	while(head != null) {
	  System.out.println(head.data);
	  /*if(head.rand != null) {
		  System.out.println(head.rand.data);
	  } else {
		  System.out.println(head.rand);
	  }*/
	  head = head.next;
	}
  }
  public static void main(String[] args) {
	Node head = createSll(new int[] {7, 13, 11, 10, 1});
	createProblem(head);
	head = deepCopy(head);
//  	test(head);
  		printSll(head);
  }
}
