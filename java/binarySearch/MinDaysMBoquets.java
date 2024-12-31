public class MinDaysMBoquets {
	public static int getMax(int[] arr) {
		int ans = arr[0];

		for(int i : arr) {
			ans = Integer.max(ans, i);
		}

		return ans;
	}
	public static boolean getPossiblity(int[] arr, int N, int m, int k, int mid) {
		int i = 0;
		int bound = 0;
		int suff = 0;
		while(i < N) {
			
			if(arr[i] <= mid) {
				bound ++;
				if(bound == k) {
					suff++;
					bound = 0;
				}
			}else {
				bound = 0;
			}

			if(suff == m) {
				return true;
			}
			i++;
		}

		return false;
	}	
	public static int getMinDays(int[] arr, int N, int m, int k) {
		if(N < m * k) {
			return -1;
		}

		int low = 1;
		int high = getMax(arr);

		while(low <= high) {
			int mid = low + (high - low) / 2;
			boolean possible = getPossiblity(arr, N, m, k, mid);

			if(possible) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return low;
	}
	public static void main(String[] args) {
		int  N = 8; 
		int arr[] = {7, 7, 7, 7, 13, 11, 12, 7};
		int m = 2;
		int k = 3;

		int ans = getMinDays(arr, N, m, k);
		System.out.println(ans);
	}
}
