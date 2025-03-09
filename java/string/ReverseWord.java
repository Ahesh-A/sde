import java.lang.StringBuilder;

public class ReverseWord {
  public static String reverseString(String str) {
	String[] strArr = str.split(" ");
	StringBuilder sb = new StringBuilder();
	
	for(String i : strArr) {
	  sb.insert(0, i + " ");
	}

    sb.deleteCharAt(sb.length() - 1);
	return sb.toString();
  
  }

  public static void main(String[] args) {
	System.out.println(reverseString("this is an amazing program"));
  }
}
