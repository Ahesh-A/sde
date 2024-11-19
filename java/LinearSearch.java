public class LinearSearch {
	public static int getIndex(int[] arr, int elem) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == elem){
				return i;	
			}
		}

		return -1;
	}
	public static void main (String[] args) {
		int[] arr = {1, 3, 5, 6, 7};
		System.out.println("index: " + getIndex(arr, 6));
	}
}
