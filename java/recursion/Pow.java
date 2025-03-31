public class Pow {
  public static double getPow(double ans, double num, int p, int count) {
	if(count > p) {
	  return ans;
	}
	
	return getPow(ans * num, num, p, count + 1);
  }
  public static void main(String[] args) {
	double ans = getPow(1, 2.1, 3, 1);
	System.out.println(ans);
  }
}
