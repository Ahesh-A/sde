public class Anagram {
  public static boolean isAnagram(String s, String t) {
	if(s.length() != t.length()) {
	  return false;
	}

	int[] sFreq = new int[26];
	int[] tFreq = new int[26];
	
	for(int i = 0; i < s.length(); i++) {
	  sFreq[s.charAt(i) - 'a'] ++;
	  tFreq[t.charAt(i) - 'a']++;
	}	

	for(int i = 0; i < 25; i++) {
	  if(sFreq[i] != tFreq[i]) {
		return false;
	  }
	}

	return true;
  }
  public static void main(String[] args) {
	String str1 = "integer";
	String str2 = "teegrin";

	System.out.println(isAnagram(str1, str2));
  }
}
