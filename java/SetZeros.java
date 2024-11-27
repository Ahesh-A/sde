import java.util.Arrays;

public class SetZeros {
	public static void setZeros(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;

		int[] hor = new int[col];
		int[] ver = new int[row];

		for (int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(arr[i][j] == 0) {
					hor[j] = 1;
					ver[i] = 1;
				}
			}
		}
	for (int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(hor[j] == 1 || ver[i] == 1) {
					arr[i][j] = 0;
				}
			}
		}		
	}

	public static void main(String[] args) {
		int[][] arr = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 0, 8, 7},
			{6, 5, 4, 3}
		};
		setZeros(arr);
		System.out.println(Arrays.deepToString(arr));	
	}
}
