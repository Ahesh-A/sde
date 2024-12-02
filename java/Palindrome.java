public class Palindrome {
	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;

		while(i < j) {
			char l = str.charAt(i);
			char r = str.charAt(j);

			if(!Character.isLetterOrDigit(l)) {
				i++;
			} else if(!Character.isLetterOrDigit(r)) {
				j--;
			}else if(Character.toLowerCase(l) != Character.toLowerCase(r)) {
				return false;
			}else {
				i ++;
				j--;
			}
		}

		return true;
	}
	public static void main(String[] args) {
		String str = "im good";
		System.out.println(isPalindrome(str));
	}
}
