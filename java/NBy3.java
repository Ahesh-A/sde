import java.util.ArrayList;
import java.util.List;

public class NBy3 {
	public static List<Integer> getListGreaterThanNBy3(int[] arr) {
		List<Integer> res = new ArrayList<>();
		int count1 = 0, count2 = 0;
		Integer max1 = null, max2 = null;
		int arrLen = arr.length;
		for(int i = 0; i < arrLen; i++) {
			Integer currElem = Integer.valueOf(arr[i]);
			if(count1 == 0 && !currElem.equals(max2)) {
				count1 = 1;
				max1 = arr[i];
			} else if(count2 == 0 && !currElem.equals(max1)) {
				count2 = 1;
				max2 = arr[i];
			} else if(currElem.equals(max1)) count1++;
			else if(currElem.equals(max2)) count2++;
			else {
				count1--;
				count2--;
			}
		}

		count1 = 0;count2 = 0;

		for(int i = 0; i < arrLen; i++) {
			Integer currElem = Integer.valueOf(arr[i]);
			if(currElem.equals(max1)) count1++;
			else if (currElem.equals(max2)) count2++;
		}
		int n = arrLen / 3 ;

		if(count1 > n) res.add(max1);
		if(count2 > n) res.add(max2);

		return res;
	}
	public static void main (String[] args) {
		int[] arr = {1, 1, 2, 1, 2, 2, 2, 3, 3, 3, 3, 3};
		System.out.println(getListGreaterThanNBy3(arr));
	}
}
