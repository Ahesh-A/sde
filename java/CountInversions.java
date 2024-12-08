import java.util.Arrays;

public class CountInversions {
	private static int count = 0;
	public static int countInversions(int[] nums, int start, int end) {
		if(start == end ) {
			return 0;
		}
		int count = 0;
		int mid = start + (end - start) / 2;

		count += countInversions(nums, start, mid);
		count += countInversions(nums, mid + 1, end);
		count += merge(nums, start, mid, end);
		return count;
	}
	
	public static int  merge(int[] nums, int start, int mid, int end) {
		int[] temp = new int[end - start + 1];

		int i = start;
		int j = mid + 1;
		int k = 0;
		int count = 0;
		while (i <= mid && j <= end) {
			if(nums[i] < nums[j]) {
				temp[k++] = nums[i++];
			} else {
				temp[k++] = nums[j++];
				count += (mid - i + 1);
			}
		}

		while(i <= mid) {
			temp[k++] = nums[i++];
		}

		while(j <= end) {
			temp[k++] = nums[j++];
		}

		for(i = start; i <= end; i++) {
			nums[i] = temp[i - start];
		}
//		System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		int[] nums = {5, 4, 3, 2, 1};
		int res = countInversions(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
		System.out.println(res);
	}
}
