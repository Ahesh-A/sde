import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class MergeIntervals {
	public static List<List<Integer>> mergeIntervals(int[][] arr) {
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});
		int n = arr.length;
		if(n == 0) {
			return null;
		}

		if(n == 1) {
			return new ArrayList<>(Arrays.asList(Arrays.asList(arr[0][0], arr[0][1])));
		}

		List<List<Integer>> list = new ArrayList<>();
		int i = 0;
		int j = i;

		while(i <= n - 1) {
			j = i + 1;
			int x = arr[i][0];
			int y = arr[i][1];
			
			while(j < n && y >= arr[j][0]) {
				y = y > arr[j][1] ? y : arr[j][1];
				j++;
			}

			list.add(new ArrayList<>(Arrays.asList(x, y)));
			i = j;
			j = j + 1;
		}
		return list;
	}
	public static void main(String[] args) {
		int[][] arr = {{1, 3}, {2, 6}, {4, 8}, {8, 10}, {7, 7}};
		List<List<Integer>> list = mergeIntervals(arr);

		System.out.println(list);
	}
}
