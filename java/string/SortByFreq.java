import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class SortByFreq {
  public static String sortByFreq(String s) {
	Map<Character, Integer> freqMap = new HashMap<>();
	char[] charArr = s.toCharArray();
	
	for(char c : charArr) {
	  Integer i = freqMap.getOrDefault(c, 0);
	  freqMap.put(c, i + 1);
	}
	List<Map.Entry<Character, Integer>> list = new ArrayList<>(freqMap.entrySet());
	list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

	StringBuilder sb = new StringBuilder();
	for(Map.Entry<Character, Integer> e : list) {
	  sb.append(e.getKey().toString().repeat(e.getValue()));
	}
	
	return sb.toString();
  }
  public static void main(String[] args) {
	String s = "tree";

	System.out.println(sortByFreq(s));
  }
}
