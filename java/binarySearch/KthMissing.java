public class KthMissing {
  public static int findKthMissingNo(int[] arr, int k) {
	int low = 0;
	int high = arr.length - 1;

	while(low <= high){
	  int mid = low + (high - low) / 2;

	  if(arr[mid] - mid - 1 < k) {
		low = mid + 1;
	  } else {
		high = mid - 1;
	  }
	}

	return k + high + 1;
  }

  public static void main(String[] args) {
	int[] arr = {4, 7, 9, 10};
	int k = 4;
	System.out.println(findKthMissingNo(arr, k));
  }
}
