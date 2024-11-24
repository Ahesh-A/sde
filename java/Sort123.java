import java.util.Arrays;
	
public class Sort123 {
	public static void sort123(int[] arr) {
		int n = arr.length;
		int i = 0, j = n - 1, k;

		while(i < n && arr[i] == 0) {
			i++;
		}
		while(j >= 0 && arr[j] == 2) {
			j--;
		}
		k = i;

		while(k <= j) {
			if(arr[k] == 0) {
				arr[k] = arr[i];
				arr[i] = 0;
				i++;
				k++;
			} else if(arr[k] == 2) {
				arr[k] = arr[j];
				arr[j] = 2;
				j--;
			} else {
				k++;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 0, 0};
		sort123(arr);
		System.out.println(Arrays.toString(arr));
	}
}
