import java.util.Arrays;

public class QuickSort {
  public static void swap(int[] arr, int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
  }
  public static void sort(int[] arr, int s, int e) {
	if(s >= e) {
	  return;
	}
	
	int elem = arr[e];
	int i = s;
	
	for(int k = s; k <= e; k++) {
	  if(arr[k] < elem) {
		swap(arr, k, i);
		i++;
	  }
	}
	swap(arr, e, i);
	sort(arr, s, i - 1);
	sort(arr, i + 1, e);
  }
  public static void quickSort(int[] arr) {
	sort(arr, 0, arr.length - 1);
  }
  public static void main(String[] args) {
	int[] arr = {5, 6, 2, 1, 3, 1, 1};
	quickSort(arr);
	System.out.println(Arrays.toString(arr));
  }
}
