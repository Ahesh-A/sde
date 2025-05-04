import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

public class WordBreak {
  public static boolean wordBreak(String s, List<String> words) {
	Set<String> wordSet = new HashSet<>(words);
	Queue<Integer> queue = new LinkedList<>();
	boolean[] seen = new boolean[s.length() + 1];
	queue.add(0);

	while(!queue.isEmpty()) {
	  int start = queue.poll();
	  if(start == s.length()) {
		return true;
	  }
	  for(int end = start + 1; end <= s.length(); end++) {
		if(seen[end]) {
		  continue;
		}
		if(wordSet.contains(s.substring(start, end))){
		  seen[end] = true;
		  queue.add(end);
		}
	  }
	}

	return false;
  }
  public static void main(String[] args) {
	List<String> words = new ArrayList<>();
	words.add("cats");
	words.add("dog");
	words.add("sand");
	words.add("and");
	words.add("cat");
	String s = "catsandog";

	boolean res = wordBreak(s, words);
	System.out.println(res);
  }
}
