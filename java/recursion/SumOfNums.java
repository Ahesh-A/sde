public class SumOfNums {
	public static int getSumOfNums(int n, int sum, int i) {
		if(i == n + 1) {
			return sum;
		}

		return getSumOfNums(n, sum + i, i + 1);
	}
	public static void main(String[] args) {
		System.out.println(getSumOfNums(10, 0, 0));
	}
}
