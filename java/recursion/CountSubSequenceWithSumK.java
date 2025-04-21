public class CountSubSequenceWithSumK {
  public static int countSubSequenceWithSumK(int[] arr, int k) {
	int[][] dp = new int[arr.length + 1][k + 1];
	dp[0][0] = 1;

	for(int i = 1; i <= arr.length; i++) {
	  for(int j = 0; j < k + 1; j++) {
		if(j - arr[i - 1] < 0) {
		  dp[i][j] = dp[i - 1][j];
		} else {
		  dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]];
		}
	  }
	}

	return dp[arr.length][k];
  }
  public static void main(String[] args) {
	int[] arr = {4, 9, 2, 5, 1};
  	int ans = countSubSequenceWithSumK(arr, 10);
	System.out.println(ans);
  }
}
