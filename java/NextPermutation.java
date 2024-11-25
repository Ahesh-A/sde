import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {
	public static int getPivot(List<Integer> list) {
		for(int i =list.size() - 1; i > 0;i--) {
			if(Integer.compare(list.get(i - 1), list.get(i)) < 0) {
				return i - 1;
			}			
		}	
		return -1;
	}
	public static int getReplacementIdx(List<Integer> list, int pivot) {
		int n = list.size();
		int res = pivot + 1	;
		Integer pivotElem = list.get(pivot);
		Integer min = list.get(res);

		for(int i = n - 1; i > pivot; i--) {
			Integer currElem = list.get(i);
			if(Integer.compare(min, currElem) > 0 && Integer.compare(currElem, pivotElem) > 0) {
				min = currElem;
				res = i;
			}
		}

		return res;
	}
	public static void swap(List<Integer> list, int i, int j) {
		Integer temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
	public static void  getNextPermutation(List<Integer> list) {
		int pivot = getPivot(list);
		if(pivot == -1) {
			Collections.reverse(list);
			return;
		}
		
		int replacementIdx = getReplacementIdx(list, pivot);
		swap(list, pivot, replacementIdx);
		List<Integer> sublist = list.subList(pivot + 1, list.size());
		Collections.reverse(sublist);
	}
	public static void main(String[] args) {
		Integer[] arr = {1, 2, 5, 7, 6, 4};
		List<Integer> list = Arrays.asList(arr);
		getNextPermutation(list);
		System.out.println(list);
	}
}
