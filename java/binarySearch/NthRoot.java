public class NthRoot {
	public static int getChoice(int num, int root, int mid) {
		long res = 1;
		for(int i = 1; i <= root; i++) {
			res *= mid; 
		}
		if(res == num) {
			return 1;
		}else if(res > num){
			return 2;
		} else {
			return 0;
		}
	}
	public static int getRoot(int num, int root) {
		int low = 1;
		int high = num;

		while(low <= high) {
			int mid = low + (high - low) / 2;
			int temp = getChoice(num, root, mid);
			if(temp == 2) {
				high = mid - 1;
			} else if(temp == 0) {
				low = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}
	public static void main(String[] args) {
		int num = 50;
		int root = 3;

		System.out.println(getRoot(num, root));
	}
}
