import java.lang.StringBuilder;

public class Decomposition {
  public static  String getPrimitiveDecomposition(String str) {
	int count = 0;
	StringBuilder sb = new StringBuilder();
	StringBuilder res = new StringBuilder();

	char[] strArray = str.toCharArray();

	for(char i : strArray) {
	  sb.append(i);
	  if(i == ')' && count > 0) {
		count--;
		if(count == 0) {
		  sb.deleteCharAt(0);
		  sb.deleteCharAt(sb.length() - 1);
		  res.append(sb);
		  sb.setLength(0);
		}
	  } else if( i == '(') {
		count++;
	  }
	  /*if(count != 1 && i != '(' || (count != 0 && i != ')')) {
		sb.append(i);
	  }*/
	  
	}

	res.append(sb);
	return res.toString();
  }
  public static void main(String[] args) {
	String str = "ahesh";
	System.out.println(getPrimitiveDecomposition(str));
  }
}
