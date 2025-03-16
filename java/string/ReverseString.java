import java.lang.StringBuilder;
import java.util.Arrays;

public class ReverseString {
  public static String reverseString(String s) {
	String[] strArr = s.split(" ");
	StringBuilder sb = new StringBuilder();
	
	System.out.println(Arrays.toString(strArr));
	for(int i = strArr.length - 1; i >= 0; i--) {
	  String strApp = strArr[i].trim();
	  if(!strApp.equals("")) {
		sb.append(strApp).append(" ");
	  }
	}
	sb.deleteCharAt(sb.length() - 1);
	return sb.toString();
  }
  public static void main(String[] args) {
	String s = "a good   example";
	System.out.println(reverseString(s));
  }
}
