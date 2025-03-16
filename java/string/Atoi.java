import java.lang.StringBuilder;

public class Atoi {
  public static String sanitize(String s) {
	s = s.trim();
	StringBuilder sb = new StringBuilder();

	if(s.charAt(0) == '-') {
	  sb.append('-');
	  s = s.substring(1, s.length());
	} else if(s.charAt(0) == '+') {
	  s = s.substring(1, s.length());
	}

	for(int i = 0; i < s.length(); i++) {
	  if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
		sb.append(Character.toString(s.charAt(i)));
	  } else {
		return sb.toString();
	  }
	}
	return sb.toString();
  }
  public static int getNum(String s) {
	int mod = Integer.MAX_VALUE;
	boolean sub = false;
	long sum = 0;
	long mul = 1;

	if(s.charAt(0) == '-') {
	  sub = true;
	  mod = Integer.MIN_VALUE;
	  s = s.substring(1, s.length());
	}
	
	for(int i = s.length() - 1; i >= 0; i--) {
	  if(sub) {
		sum = (sum - Long.valueOf(Character.toString(s.charAt(i))) * mul) % mod;
	  } else {
		sum = (sum + Long.valueOf(Character.toString(s.charAt(i))) * mul) % mod;
	  }
	  mul = (mul * 10) % mod;
	}
	return (int)sum;
  }
  public static int getNumber(String s) {
	s = sanitize(s);
	int res = getNum(s); 
	System.out.println(res);
	return 0;
  }
  public static void main(String[] args) {
	String s = "-124e3e";
	System.out.println(getNumber(s));
  }
}
