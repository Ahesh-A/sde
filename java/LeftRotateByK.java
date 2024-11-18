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
		reverse(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		reverse(arr, 0, k - 1);
		System.out.println(Arrays.toString(arr));
		reverse(arr, k, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int k = 2;
		leftRotateByK(arr, k);
//		System.out.println(Arrays.toString(arr));
	}
}
