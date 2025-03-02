import java.util.*;

public class Gasstation {
  public static int getCount(int[] arr, double mid) {
	int count = 0;

	for(int i = 1; i < arr.length; i++) {
	  int length = arr[i] - arr[i - 1];
	  int required = (int)(length / mid);
	  if( length == required * mid) {
		required --;
	  }
	  count += required;
	}
	return count;
  }

  public static double getMinDistance(int[] arr, int k) {
	double low = 0;
	double high = 0;

	for(int i = 1; i < arr.length; i++) {
	  high = Math.max(high, arr[i] - arr[i - 1]);
	}

	double diff = 1e-6;

	while(high - low > diff) {
	  double mid = (low + high) / 2.0;
	  int count = getCount(arr, mid);

	  if(k < count) {
		low = mid;
	  } else {
		high = mid;
	  }
	}

	return high;
  }
  public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7,8,9,10};
	int k = 1;
	
	System.out.println(getMinDistance(arr, k));
  }
}
