public class CountPairs {
	public static int countPairs(int[] nums, int start, int end) {
		if(start == end) {
			return 0;
		}

		int mid = start + (end - start) / 2;
		int res = 0;

		res += countPairs(nums, start, mid);
		res += countPairs(nums, mid + 1, end);
		res += count(nums, start, mid, end);
		merge(nums, start, mid, end);

		return res;
	}

	public void merge(int[] nums, int start, int mid, int end) {
		int[] temp = int[end - start + 1];

		int i = 0, j = mid + 1, k = 0;

		while(i <= mid && j <= end){
			if(nums[i] < nums[j]) {
				temp[k++] = nums[i++];
			} else {
				temp[k++] = nums[j++];
			}
		}
		while(i <= mid) {
			temp[k++] = nums[i++];
		}
		while(j <= end) {
			temp[j++] = nums[j++];
		}

		for(i = start; i <= end; i++) {
			nums[i] = temp[i - start];
		}
	}

	public static void main(String[] args) {
		int[] nums = {1, 3, 2, 3, 1};
		int res = countPairs(nums);
	}

}

