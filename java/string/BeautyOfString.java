public class BeautyOfString {
  public static int findBeauty(String s) {
	int ans = 0;
	for(int i = 0; i < s.length(); i++) {
	  int[] freq = new int[26];
	  for(int j = i; j < s.length(); j++) {
		char c = s.charAt(j);
		freq[c - 'a']++;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for(int k = 0; k < 26; k++) {
		  if(freq[k] > 0) {
			min = Integer.min(min, freq[k]);
			max = Integer.max(max, freq[k]);
		  }  
		}
		ans += (max - min);
	  }
	}

	return ans;
  }
  public static void main(String[] args) {
	String s = "aabcbaa";
	System.out.println(findBeauty(s));
  }
}
