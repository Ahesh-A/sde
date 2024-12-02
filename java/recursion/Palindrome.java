public class Palindrome {
	public static boolean isPalindrome(String str, int start, int end) {
		if(start >= end) {
			return true;
		}
		char l = str.charAt(start);
		char r = str.charAt(end);

		if(!Character.isLetterOrDigit(l)) {
			return isPalindrome(str, start + 1, end);
		} else if(!Character.isLetterOrDigit(r)) {
			return isPalindrome(str, start, end - 1);
		}else if(Character.toLowerCase(l) != Character.toLowerCase(r)) {
			return false;
		}else {
			return isPalindrome(str, start + 1, end - 1);
		}
	}
	public static void main(String[] args) {
		String str = "(Ma__d-a.,m+";
		System.out.println(isPalindrome(str, 0, str.length() - 1));
	}
}

