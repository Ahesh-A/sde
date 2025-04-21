import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class PhoneNumber {
  public static void getNumberHelper(char[] num, StringBuilder sb, List<String> ans, char[][] str, int idx) {
	if(num.length == 0) {
	  return;
	}

	if(sb.length() == num.length) {
	  ans.add(sb.toString());
	  return;
	}

	for(int i = idx; i < num.length; i++) {
	  for(int j = 0; j < str[num[i] - '0' - 1].length; j++) {
		char c = str[num[i] - '0' - 1][j];
		System.out.println(str[i + 1].length);
		sb.append(c);
		getNumberHelper(num, sb, ans, str, i + 1);
		sb.deleteCharAt(sb.length() - 1); 
	  }
	}
  }
  public static char[][] getStr() {
	char[][] res = {{}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},{'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
	return res;
  }
  public static List<String> getNumber(String input) {
	char[] num = input.toCharArray();
	List<String> list = new ArrayList<>();

	getNumberHelper(num, new StringBuilder(), list, getStr(), 0);
	return list;
  }

  public static void main(String[] args) {
	String input = "7";
	List<String> ans = getNumber(input);
	System.out.println(ans);
  }
}
