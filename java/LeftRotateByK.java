import java.util.Arrays;

public class LeftRotateByK {
	public static void reverse(int[] arr, int start, int end){
		for(int i = start; i <= (end + start) / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[end + start - i];
			arr[end + start - i] = temp;
		}
	}
	public static void leftRotateByK(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		reverse(arr, 0, n - 1);
		reverse(arr, n - k , n - 1);
		reverse(arr, 0, n - k - 1);
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int k = 14;
		leftRotateByK(arr, k);
		System.out.println(Arrays.toString(arr));
	}
}
