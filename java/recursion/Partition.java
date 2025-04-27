import java.util.ArrayList;
import java.util.List;

public class Partition {
  public static boolean isPalindrome(String str) {
	int len = str.length();

	for(int i = 0; i < len / 2; i++) {
	  if(str.charAt(i) != str.charAt(len - i - 1)) {
		return false;
	  }
	}

	return true;
  }
  public static boolean isPalindromeList(List<String> list) {
	boolean res = true;
	for(String s : list) {
	  res &= isPalindrome(s);
	}

	return res;
  }
  public static void getPartitionHelper(String str, int start, List<String> list, List<List<String>> ans) {
	if(start == str.length() && isPalindromeList(list)) {
	  ans.add(new ArrayList<>(list));
	  return;
	}

	for(int i = start; i < str.length(); i++) {
	  String sub = str.substring(start, i + 1);
	  list.add(sub);
	  getPartitionHelper(str, i + 1, list, ans);
	  list.remove(list.size() - 1);
	}
  }
  public static List<List<String>> getPartition(String str) {
	List<String> list = new ArrayList<>();
	List<List<String>> ans = new ArrayList<>();
	
	getPartitionHelper(str, 0, list, ans);
	return ans;
  }
  public static void main(String[] args) {
	String str = "aac";
	List<List<String>> ans = getPartition(str);
	System.out.println(ans);
  }
}
