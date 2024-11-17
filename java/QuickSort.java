import java.util.Arrays;

public class QuickSort {
	public static void swap(int[] arr, int i, int j) {
		if(i < 0 || j >= arr.length){
			return;
		}
		System.out.print("i: " + i + "j: " + j);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static int getPivot(int[] arr, int low, int high) {
		int i = low;
		int j = high;
		int pivotElem = arr[low];
		
		while(i < j) {
			while(i < j && arr[i] <= pivotElem) {
				i++;
			}
			while(i < j && arr[j] >= pivotElem && j >= low + 1) {
				j--;
			}
			if(i < j) {
				swap(arr, i, j);
			}
			
		}
		swap(arr, i - 1, low);
		return i - 1;
	}
	public static void  quickSort(int[] arr, int low, int high) {
		if(low >= high) {
			return;
		}
		int pivot = getPivot(arr, low, high);
		System.out.print(pivot);
		quickSort(arr, low, pivot - 1);
		quickSort(arr, pivot + 1, high);
	} 
	public static void main(String[] args) {
		int[] arr = {3, 2, 5, 1, 7};
		quickSort(arr, 0, arr.length - 1);
		System.out.print(Arrays.toString(arr));
	}
}
