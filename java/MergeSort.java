import java.util.Arrays;
public class MergeSort {
	public static void merge(int[] arr, int low, int mid, int high){
		int[] temp = new int[high - low + 1];
		int i = low;
		int j = mid + 1;
		int k = 0;
		while(i < mid + 1 && j < high + 1) {
			if(arr[i] < arr[j]){
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}
		
		while(i < mid + 1) {
			temp[k++] = arr[i++];
		}
		while(j < high + 1) {
			temp[k++] = arr[j++];
		}
		
		for(i = low; i < high + 1; i++) {
			arr[i] = temp[i - low];
		}
	}
	public static void mergeSort(int[] arr, int low, int high){
		if(low == high) {
			return;
		}
		int mid = low + (high - low) / 2;

		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}
	public static void main (String[] args) {
		int[] arr = {2, 3, 5, 7, 9, 1};
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}











}
