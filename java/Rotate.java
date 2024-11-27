import java.util.Arrays;

public class Rotate {
	public static void transpose(int[][] arr) {
		int n = arr.length;

		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}
	public static void rotate(int[][] arr) {
		transpose(arr);
		for(int[] row: arr) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
		int n = arr.length;

		for(int j = 0; j < n; j++) {
			for(int i = 0; i < n / 2; i++) {
				int temp = arr[i][j];
				arr[i][j] = arr[n - i - 1][j];
				arr[n - i - 1][j] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int[][] arr = {
			{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15},
			{16, 17, 18, 19, 20},
			{21, 22, 23, 24, 25}
		};

		rotate(arr);
		
		for(int[] row: arr) {
			System.out.println(Arrays.toString(row));
		}
	}
}
