import static dllutil.DllUtil.createDll;
import dllutil.DlNode;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FindPairs {
  public static List<List<Integer>> findPairs(DlNode head, int target) {
	DlNode tail = head;
	while(tail.next != null) {
	  tail = tail .next;
	}
	List<List<Integer>> ans = new ArrayList<>();

	while(head != null && tail != null && tail != head) {
	  int tailData = tail.data;
	  int headData = head.data;
	  int temp = tailData + headData;

	  if(temp == target) {
		ans.add(new ArrayList<>(Arrays.asList(headData, tailData)));
		head = head.next;
	  } else if (temp < target) {
		head = head.next;
	  } else {
		tail = tail.prev;
	  }
	}

	return ans;
  }
  public static void main(String[] args) {
	DlNode head = createDll(new int[] {1, 2, 3, 4, 5, 6});
	List<List<Integer>> ans = new ArrayList<>();
	
	System.out.println(findPairs(head, 7));
  }
}
