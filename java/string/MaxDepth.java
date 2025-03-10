public class MaxDepth {
  public static int getMaxDepth(String s) {
	int res = 0;
	int count = 0;

	for(int i = 0; i < s.length(); i++) {
	  if(s.charAt(i) == '(') {
		count ++;
	  } else if(s.charAt(i) == ')') {
		count --;
	  }

	  res = Integer.max(res, count);
	}

	return res;
  }
  public static void main(String[] args) {
	String s = "(1+(2*3)+((8)/4))+1";
	System.out.println(getMaxDepth(s));
  }
}
