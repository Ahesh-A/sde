import java.util.Arrays;

public class RepeatingMissing {
	public static int[] getMissingAndRepeating(int[] arr){
		int nums = 0;
		int n = arr.length;

		for(int i = 0; i < n; i++) {
			nums ^= arr[i];
			nums ^= (i + 1);
		}
		
		int seperator = nums & ~ (nums - 1);
		
		int ones = 0;
		int zeros = 0;

		for(int i = 0; i < n; i++) {
			if((seperator & arr[i]) != 0){
				ones ^= arr[i];
			} else {
				zeros ^= arr[i];
			}
		}
		for(int i = 0; i < n; i++) {
			if((seperator & (i + 1)) != 0) {
				ones ^= (i + 1);
			} else {
				zeros ^= (i + 1);
			}
		}

		int count = 0;
		for(int i = 0; i < n; i++) {
			if(ones == arr[i]) {
				count ++;
			}
		}

		return count == 2 ? new int[]{zeros, ones} : new int[]{ones, zeros};
	}
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 3, 5};
		int[] res = getMissingAndRepeating(nums);

		System.out.println(Arrays.toString(res));
	}
}
