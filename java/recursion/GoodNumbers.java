public class GoodNumbers {
  public static int powMod(int x, int n) {
	int mod = 10000007;

	if(n == 0) {
	  return 1;
	}

	if(n == 1) {
	  return x;
	}

	int half = powMod(x, n / 2) % mod;

	if(n % 2 == 0) {
	  return (half * half) % mod;
	} else {
	  return (x * half * half) % mod;
	}
  }
  public static int getGoodNum(int n) {
	int mod = 10000007;

	if(n % 2 == 0) {
	  long res = powMod(20, n / 2);
	  return (int) res;
	} else {
	  long res = powMod(20, n / 2);
	  res = (res * 5) % (mod);
	  return (int)res;
	}
  }
  public static void main(String[] args) {
	int number = 50;
	long res = getGoodNum(number);
	System.out.println(res);
  }
}
