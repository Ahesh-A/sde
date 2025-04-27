import java.lang.StringBuilder;

public class FindWord{
  public static boolean wordPresent(int i, int j, char[][] word, String str, int idx) {

	if(idx == str.length() - 1 && str.charAt(idx) == word[i][j]) {
	  return true;
	}
	boolean left = false;
	boolean top = false;
	boolean right = false;
	boolean down = false;
	char temp = word[i][j];
	word[i][j] = '0';

	if(j > 0 && str.charAt(idx + 1) == word[i][j - 1]) {
	  left = wordPresent(i, j - 1, word, str, idx + 1);
	}
	
	if(i > 0 && str.charAt(idx + 1) == word[i - 1][j]) {
	  top = wordPresent(i - 1, j, word, str, idx + 1);
	}

	if(j < word[0].length - 1 && str.charAt(idx + 1) == word[i][j + 1]) {
	  right = wordPresent(i, j + 1, word, str, idx + 1);
	}

	if(i < word.length - 1 && str.charAt(idx + 1) ==  word[i + 1][j]) {
	  down = wordPresent(i + 1, j, word, str, idx + 1);
	}
	word[i][j] = temp;
	return (left || top || right || down);
  }
  public static boolean isWordPresent(String str,char[][] word) {
	
	for(int i = 0; i < word.length; i++) {
	  for(int j = 0; j < word[0].length; j++) {

		if(word[i][j] == str.charAt(0) && wordPresent(i, j, word, str, 0)) {
		  return true;
		}
	  }
	}

	return false;
  }
  public static void main(String[] args) {
	char[][] word = {
	  {'A'}
	};

	String str = "A";
	boolean res = isWordPresent(str, word);
	System.out.println(res);
  }
}














