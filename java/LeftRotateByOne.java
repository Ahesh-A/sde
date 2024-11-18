import java.util.Arrays;

public class LeftRotateByOne {
	public static void leftRotateByOne(int[] arr){
		int temp = arr[0];
		int n = arr.length;

		for(int i = 0; i < n - 1; i++){
			arr[i] = arr[i + 1];
		}
		arr[n - 1] = temp;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		leftRotateByOne(arr);
		System.out.print(Arrays.toString(arr));
	}
}
