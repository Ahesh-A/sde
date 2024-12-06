import java.util.Arrays;

public class MergeSortedIntervals {
	public static void swap(int[] arr1, int[] arr2, int i, int j){
		int temp = arr1[i];
		arr1[i] = arr2[j];
		arr2[j] = temp;
	}

	public static void mergeIntervals(int[] arr1, int[] arr2) {
		int i = arr1.length - 1;
		int j = 0;

		while(i >=0 && j < arr2.length) {
			if(arr1[i] > arr2[j]) {
				swap(arr1, arr2, i , j);
			} else {
				break;
			}
			i--;
			j++;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	}
	public static void main(String[] args) {
		int[] arr1 = {1, 4, 8, 10};
		int[] arr2 = {2, 3, 9};
		mergeIntervals(arr1, arr2);
		System.out.print(Arrays.toString(arr1));
		System.out.print(Arrays.toString(arr2));
	}
}
