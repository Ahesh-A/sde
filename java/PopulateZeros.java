import java.util.Arrays;

public class PopulateZeros {
	public static void populateZeros(int[] arr) {
		int j = -1;
		int n = arr.length;
		for(int k = 0; k < n; k++) {
			if(arr[k] == 0) {
				j = k;
				break;	
			}			
		}
		if(j == -1) {
			return;
		}
		for(int i = j + 1; i < n; i++) {
			if(arr[i] != 0) {
				arr[j] = arr[i];
				arr[i] = 0;
				j++;
			}
		}
	}
	public static void main(String[] args ){
		int[] arr = {1, 2, 0, 0, 3, 2, 4, 5, 6, 0, 0, 0, 4, 0,  5, 0};
		populateZeros(arr);
		System.out.println(Arrays.toString(arr));
	}
}
