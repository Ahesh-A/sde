public class Print1ToN {
	public static void printNums(int n, int k) {
		if(k > n) {
			return;
		}

		System.out.println(k);
		printNums(n, k + 1);
	}
	public static void main(String[] args) {
		printNums(8, 1);
	}
}
