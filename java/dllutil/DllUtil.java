package dllutil;

import dllutil.DlNode;
public class DllUtil {
  public static DlNode createDll(int[] arr) {
	DlNode head = new DlNode(0);
	DlNode temp = head;

	for(int i : arr) {
	  DlNode n = new DlNode(i);
	  temp.next = n;
	  n.prev = temp;
	  temp = temp.next;
	}
	DlNode first = head;
	head = head.next;
	first.next = null;
	head.prev = null;
	return head;
  }

  public static void printDll(DlNode head) {
	while(head != null) {
	  System.out.println(head.data);
	  head = head.next;
	}
  }
}
