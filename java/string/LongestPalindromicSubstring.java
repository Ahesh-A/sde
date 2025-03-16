public class LongestPalindromicSubstring {
  public static String getOddMax(String s){
	int n = s.length();
	int max = 0;
	String ans = "";

	for(int i = 0; i < n; i++) {
	  int left = i;
	  int right = i;
	  while(left >= 0 && right <= n - 1) {
		if(s.charAt(left) != s.charAt(right)) {
		  break;
		}
		if(right - left + 1 > max) {
		  ans = s.substring(left, right + 1);
		  max = right - left + 1;
		}	
		right++;
		left--;
	  }
	}

	return ans;
  }
  public static String getEvenMax(String s) {
	int max = 0;
	String ans = "";

	for(int i = 0; i < s.length(); i++) {
	  int left = i;
	  int right = i + 1;
  
	  while(left >= 0 && right <= s.length() - 1) {
		if(s.charAt(left) != s.charAt(right)) {
		  break;
		} 

		if(right - left + 1 > max) {
		  ans = s.substring(left, right + 1);
		  max = right - left + 1;
		}
		left--;
		right++;
	  }
	}
	return ans;
  }

  public static String getLongestPalindromicSubstring(String s) {
	int max = 0;

	String oddMax = getOddMax(s);
	String evenMax = getEvenMax(s);
//	return "";
	return oddMax.length() > evenMax.length() ? oddMax : evenMax;
  }
  public static void main(String[] args) {
	String s = "babaaba";
//	System.out.println(getEvenMax(s));
	System.out.println(getLongestPalindromicSubstring(s));
  }
}
