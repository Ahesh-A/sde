import static sllutil.SllUtil.createSll;
import static sllutil.SllUtil.printSll;
import static sllutil.SllUtil.createChildLl;
import static sllutil.SllUtil.printChildLl;
import sllutil.Node;
import java.util.List;
import java.util.ArrayList;

public class FlatLl {
  public static Node createProblem() {
	Node chain = createSll(new int[] {4, 5, 1, 3, 7});
	Node child1 = createChildLl(new int[] {5, 7, 9});
	Node child2 = createChildLl(new int[] {8, 10, 11});
	Node child3 = createChildLl(new int[] {3, 5, 7});
	Node child4 = createChildLl(new int[] {4, 5, 6});
	Node child5 = createChildLl(new int[] {9, 12, 15});

	List<Node> list = new ArrayList<>();
	list.add(child1);
	list.add(child2);
	list.add(child3);
	list.add(child4);
	list.add(child5);
	
	Node temp = chain;

	for(int i = 0; temp != null; i++) {
	  temp.child = list.get(i);
	  temp = temp.next;
	}

	return chain;
  }
  public static void print(Node head) {
	while(head != null) {
	  System.out.println(head.data);
	  printChildLl(head.child);
	  head = head.next;
	}
  }

  public static Node mergeList(Node list1, Node list2) {
	Node head = new Node(-1);
	Node temp = head;
//	printChildLl(list1);
//	printChildLl(list2);

	while(list1 != null && list2 != null) {
	  if(list1.data < list2.data) {
		temp.child = list1;
		temp = list1;
		list1 = list1.child;
	  } else {
		temp.child = list2;
		temp = list2;
		list2 = list2.child;
	  }
	}

	if(list1 != null)  {
	  temp.child = list1;
	} 
	if(list2 != null) {
	  temp.child = list2;
	}
	//printList(head.child);
	//System.out.println();
	return head.child;
  }
  public static Node flatternList(Node head) {
	if(head == null || head.next == null) {
	  return head;
	}
	Node list1 = head;
	Node list2 = head.next;

	while(list1 != null && list2 != null) {
	  list1 = mergeList(list1, list2);
	  list2 = list2.next;
	}

	return list1;
  }
  public static void main(String[] args) {
	  Node chain = createProblem();	
//	  Node res = mergeList(chain, chain.next);
//	  printChildLl(res);
	// printList(res);
//	  print(chain);
	  Node res = flatternList(chain);
	  printChildLl(res);
  }
}
