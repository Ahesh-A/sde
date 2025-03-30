import static sllutil.SllUtil.createSll;
import sllutil.Node;

public class Intersect {
  public static void createYchain(Node leftChain, Node rightChain, Node centerChain) {
	while(leftChain.next != null) {
	  leftChain = leftChain.next;
	}
	while(rightChain.next != null) {
	  rightChain = rightChain.next;
	}

	leftChain.next = centerChain;
	rightChain.next = centerChain;
  }
  
  public static Node findIntersection(Node leftChain, Node rightChain) {
	if(leftChain == null || rightChain == null) {
	  return null;
	}

	Node l = leftChain;
	Node r = rightChain;
	  
	do {
	  if(l == null) {
	  l = rightChain;
	  }
	  if(r == null) {
		r = leftChain;
	  }
	  if(l == r) {
		return l;
	  }

	  l = l.next;
	  r = r.next;
	} while(l != r);

	return l;
  }
  public static void main(String[] args) {
	Node leftChain = createSll(new int[] {1, 2, 3});
	Node rightChain = createSll(new int[] {4, 5, 6});
	Node centerChain = createSll(new int[] { 9});
	//createYchain(leftChain, rightChain, centerChain);
	Node ans = findIntersection(leftChain, null);
	if(ans != null) {
	  System.out.println(ans.data);
	} else {
	  System.out.println(ans);
	}
  }
}
