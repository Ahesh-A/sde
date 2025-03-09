public class IsomorphicString {
  public static boolean isIsomorphic(String str1, String str2) {
	int[] sIdx1 = new int[200];
	int[] sIdx2 = new int[200];

	for(int i = 0; i < str1.length(); i++) {
	  if(sIdx1[str1.charAt(i)] != sIdx2[str2.charAt(i)]) {
		return false;
	  }

	  sIdx1[str1.charAt(i)] = i + 1;
	  sIdx2[str2.charAt(i)] = i + 1;
	}

	return true;
  }
  public static boolean solution2(String s, String t) {
	int[] sIdx = new int[123];
	int[] tIdx = new int[123];

	for(int i = 0; i < s.length(); i++) {
	  char sChar = s.charAt(i);
	  char tChar = t.charAt(i);

	  if(sIdx[sChar] == 0 && tIdx[tChar] == 0) {
		sIdx[sChar] = tChar;
		tIdx[tChar] = sChar;
	  } else if (sIdx[sChar] != tChar || tIdx[tChar] != sChar) {
		return false;
	  }
	}

	return true;
  }
  public static void main(String[] args) {
	String str1 = "bbbaaaba";
	String str2 = "aaabbbba";
	System.out.println(solution2(str1, str2));
  }
}
