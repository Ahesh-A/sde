public class StockBuySell {
	public static int getMaxProfit(int[] arr) {
		int max = 0;
		int min = arr[0];

		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			} else {
				max = Integer.max(max, arr[i] - min);
			}
		}

		return max;
	}
	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 1, 6};
		System.out.println(getMaxProfit(arr));
	}
}
