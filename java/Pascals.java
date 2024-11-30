public class Pascals {
	public static int getPascalNumber(int row, int col){
		if(col  > row) {
			return -1;
		}

		if(row - col >= 0) {
			col =row - col + 1;
		}
		
		if(col == 1) {
			return 1;
		}

		int res = 1;
		int i = 1;
		int mul = row;

		while(i <= col - 1) {
			res *= (mul - i);
			res /= i;

			i ++;
		}
		return res;
	}
	public static void main(String[] args) {
		int row = 7;
		int col = 8;
		System.out.println(getPascalNumber(row, col));
	}
}
