import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Union {
	public static Integer[] getUnion(int[] arr1, int[] arr2){
		int i = 0;
		int j = 0;
		Integer lastElem = null;
		List<Integer> list = new ArrayList<Integer>();
		Integer elem1, elem2;
		while(i < arr1.length && j < arr2.length) {
			elem1 = arr1[i];
			elem2 = arr2[j];

			if(elem1 == elem2) {
				if(!elem1.equals(lastElem)){
					lastElem = elem1;
					list.add(elem1);
				}
				i++;
				j++;
			}
			else if(elem1 < elem2) {
				if(!elem1.equals(lastElem)){
					lastElem = elem1;
					list.add(elem1);
				}
				i++;
			} else {
				if(!elem2.equals(lastElem)) {
					lastElem = elem2;
					list.add(elem2);
				}
				j++;
			}
		}
		System.out.print("out of while");
		while(i < arr1.length) {
			elem1 = arr1[i];
			if(!elem1.equals(lastElem)) {
				lastElem = elem1;
				list.add(elem1);
			}
			i++;
		}

		while(j < arr2.length) {
			elem2 = arr2[j];
			if(!elem2.equals(lastElem)) {
				lastElem = elem2;
				list.add(elem2);
			}
			j++;
		}
		return list.toArray(new Integer[0]);
	}
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 3, 4,  4, 5, 8, 9};
		int[] arr2 = {3, 4, 5, 5, 5, 6, 7};
		System.out.println(Arrays.toString(getUnion(arr1, arr2)));
	}
}
