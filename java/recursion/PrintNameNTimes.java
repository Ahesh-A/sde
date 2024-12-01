public class PrintNameNTimes {
	public static void printName(String name, int n, int i) {
		if (i == n){
			return;
		}	

		System.out.println(name);
		printName(name, n, i + 1);
	}
	public static void main(String[] args) {
		printName("Ahesh", 5, 0);
	}
}
