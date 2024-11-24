import java.util.Arrays;

public class Rearrange {
	public static int[] rearrange(int[] arr) {
		int n = arr.length;
		int[] ans = new int[n];

		int pos = 0, neg = 1;

		for(int i = 0; i < n; i++) {
			if(arr[i] >= 0) {
				ans[pos] = arr[i];
				pos += 2;
			} else {
				ans[neg] = arr[i];
				neg += 2;
			}
		}

		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,-4,-5};
		System.out.println(Arrays.toString(rearrange(arr)));
	}
}
