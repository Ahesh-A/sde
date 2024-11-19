import java.util.Arrays;

public class PopulateZeros {
	public static void populateZeros(int[] arr) {
		int i = 0;	
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] != 0) {
				while(i < j && arr[i] != 0) {
					i++;
				}
				if(i != j) {
					arr[i] = arr[j];
					arr[j] = 0;
				}
			}			
		}
	}
	public static void main(String[] args ){
		int[] arr = {1, 2, 0, 0, 3, 2, 4, 5, 6, 0, 0, 0, 4, 0,  5, 0};
		populateZeros(arr);
		System.out.println(Arrays.toString(arr));
	}
}
