public class Leaders {
	public static void getLeaders(int[] arr) {
		int n = arr.length;
		int[] maxTillIdx = new int[n];
		int max = arr[n - 1];
		maxTillIdx[n - 1] = arr[n - 1];

		for(int i = n - 2; i >= 0; i--) {
			if(max < arr[i]) {
				max = arr[i];
			}

			maxTillIdx[i] = max;
		}

		for(int i = 0; i < n; i++) {
			if(arr[i] == maxTillIdx[i]) {
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {10, 22, 12, 3, 0, 6};
		getLeaders(arr);
	}
}
