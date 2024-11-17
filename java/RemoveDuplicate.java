import java.util.Arrays;

public class RemoveDuplicate{
	public static int removeDuplicates(int[] arr) {
		int i = 0;

		for(int j = 1; j < arr.length; j++) {
			if(arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 3, 3, 4, 5, 5, 6};
		System.out.println(removeDuplicates(arr));
		System.out.println(Arrays.toString(arr));
	}
}
