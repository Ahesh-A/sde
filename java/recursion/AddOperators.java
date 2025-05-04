import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class AddOperators {
  public static boolean equalsTarget(StringBuilder temp, int target) {
	StringBuilder sb = new StringBuilder(temp.toString());
	int i = 1;
	while(i < sb.length()) {
	  if(sb.charAt(i) == '*') {
		int left = sb.charAt(i - 1) - '0';
		int right = sb.charAt(i + 1) - '0';
		  
		sb.replace(i - 1, i + 2, String.valueOf(left * right));
		continue;
	  }

	  i++;
	}
	rystem.out.println(sb);
	int sum = sb.charAt(0) - '0';

	for(i = 1; i < sb.length(); i = i + 2) {
	  if(sb.charAt(i) == '+') {
		sum = sum + sb.charAt(i + 1) - '0';
	  } else if(sb.charAt(i) == '-'){
		sum = sum - sb.charAt(i + 1) + '0';
	  }
	}
	System.out.println(sum);

	return sum == target;
  }

  public static void solveHelper(int len, int target, int idx, StringBuilder sb, List<String> ans) {
//	System.out.println(sb);
	if(sb.length() == len * 2 - 1) {
	  if(equalsTarget(sb, target)) {
		ans.add(sb.toString());
	  }
	  return;
	}
	sb.insert(idx, '+');
	solveHelper(len, target, idx + 2, sb, ans);
	sb.deleteCharAt(idx);
	sb.insert(idx, '-');
	solveHelper(len, target, idx + 2, sb, ans);
	sb.deleteCharAt(idx);
	sb.insert(idx, '*');
	solveHelper(len, target, idx + 2, sb, ans);
  }
  public static List<String> solve(String num, int target) {
	List<String> ans = new ArrayList<>();
	solveHelper(num.length(), target, 1, new StringBuilder(num), ans);

	return ans;
  }
  public static void main(String[] args) {
	int target = 6;
	String num = "232";
	List<String> ans = solve(num, target);
	System.out.println(ans);
  }
}
