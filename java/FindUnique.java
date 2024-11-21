public class FindUnique {
	public static int findUnique(int[] arr){
		int res = 0;
		for(int i = 0; i < arr.length; i++) {
			res ^= arr[i];
		}
		return res;
	}
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 3, 2, 1, 4, 5, 5};
		System.out.println("Result: " + findUnique(arr));
	}
}
