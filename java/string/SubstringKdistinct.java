import java.util.HashMap;
import java.util.Map;

public class SubstringKdistinct {
  public static boolean isDistinct(String s, int idx, Map<Character, Integer> map) {
	char c = s.charAt(idx);

	return map.getOrDefault(c, 0).equals(0);
  }
  public static boolean couldMoveRight(String s, int dist, int k, int idx, Map<Character, Integer> map) {
	if(idx == s.length()) {
	  return false;
	}

	char c = s.charAt(idx);
	
	if(isDistinct(s, idx, map)) {
	  dist++;
	}
	
	return dist <= k;
  }

  public static int getUniqueSubString(String s, int k) {
	int dist = 1;
	int right = 0;
	int left = -1;
	int n = s.length();
	int ans = 0;

	Map<Character, Integer> map = new HashMap<>();
	map.put(s.charAt(0), 1);
	while(right < n && left < n - 1) {
	  //System.out.println(left + " " + right + " " + dist + " " + map);
	  if(dist == k) {
		  ans++;
	  }

	  boolean couldMoveRight = couldMoveRight(s, dist, k, right + 1, map);
	  if(couldMoveRight) {
		right++;
		char c = s.charAt(right);		
		int freq = map.getOrDefault(c, 0);
		if(freq == 0) {
		  dist++;  
		}
		map.put(c, freq + 1);
	  } else {
		left++;
		char c = s.charAt(left);
		int freq = map.get(c);
		
		if(freq == 1) {
		  dist --;
		}
		map.put(c, freq - 1);
	  }

	}
	return ans;
  }
  public static void main(String[] args) {
	String s = "abaaca";
/*	Map<Character, Integer> map = new HashMap<>();
	map.put('a', 0);
	map.put('b', 0);
	map.put('c', 0);
	
	System.out.println(couldMoveRight(s, 0, 1, 5, map));
	*/
	System.out.println(getUniqueSubString(s, 1));
  }
}
