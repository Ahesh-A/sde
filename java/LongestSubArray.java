public class LongestSubArray {
	public static int getLongestSubArray(int[] arr, int k) {
		int n = arr.length;
		if(n == 0 ){
			return 0;
		}
		int i = 0 , j = 0;
		int res = 1;
		int sum = arr[0];
		while(j < n) {
			while(i <=j && sum > k) {
				sum -= arr[i];
				i++;
			}
			if(sum == k) {
				res = Integer.max(res, j - i + 1);
			}
			j++;
			if(j < n) {
				sum += arr[j];
			}
		}

		return res;
	}
	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 1, 9, 1, 1, 1, 1, 2, 3, 1};
		System.out.println(getLongestSubArray(arr, 10));
	}
}
