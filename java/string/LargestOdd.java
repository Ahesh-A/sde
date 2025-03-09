public class LargestOdd {
  public static String getLargeOdd(String str) {
	for(int i = str.length() - 1; i >= 0; i--) {
	  if((str.charAt(i) - '0') % 2 != 0) {
		return str.substring(0, i + 1);
	  }
	}

	return "";
  }
  public static void main(String[] args) {
	String str = "3542";

	System.out.println("Result: " + getLargeOdd(str));
  }
}
