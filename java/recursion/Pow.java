public class Pow {
  public static double powHelper(double x, int n) {
	if(n == 0) {
	  return 1;
	}

	if(n == 1) {
	  return x;
	}

	double half = powHelper(x, n / 2);

	if(n % 2 == 0){
	  return half * half;
	} else {
	  return x * half * half;
	}
  }
  public static double powLn(double x, int n) {
	if(n < 0) {
	  return 1.0/powHelper(x, n);
	}

	return powHelper(x, n);
  }
  public static double pow(long x, long n) {
	if(n < 0) {
	  x = 1 / x;
	  n = -1 * n;
	}
	long res = 1;
	while(n > 0) {
	  if((n & 1) == 1) {
		res = res * x;
	  }

	  x = x * x;
	  n = n >> 1;
	}

	return (double)res;
  }
  public static double getPow(double ans, double num, int p, int count) {
	if(count > p) {
	  return ans;
	}
	
	return getPow(ans * num, num, p, count + 1);
  }
  public static void main(String[] args) {
//	double ans = getPow(1, 2.1, 3, 1);
	double ans = powLn(2, 11);
	System.out.println(ans);
  }
}
