import java.util.Arrays;

public class AggresssiveCows {
  public static boolean couldPlaced(int[] arr, int dist, int cows) {
	int count = 1;
	int previousPlaced = arr[0];
	for(int i = 1; i < arr.length; i++) {
	  if(arr[i] - previousPlaced >= dist) {
		count ++;
		previousPlaced = arr[i];
	  }
	}

	return count >= cows;
  }

  public static int getResult(int[] arr, int cows) {
	int min = 1;
	int max = arr[arr.length - 1] - arr[0];
	int res = -1;
	
	while(min < max) {
	  int mid = min + (max - min) / 2;
	  if(couldPlaced(arr, mid, cows)) {
		min = mid + 1;
		res = mid;
	  } else {
		max = mid - 1;
	  }  
	}

	return res;
  } 
  public static void main(String[] args) {
	int[] position = {0,3,4,7,10,9};
	Arrays.sort(position);
	int cows = 4;
	System.out.println("Result: " + getResult(position, cows));
  }
}
