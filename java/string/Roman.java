public class Roman {
  public static int getNum(char c, char lastChar) {
	if(c == 'I') {
	  if(lastChar == 'V' || lastChar == 'X') {
		return -1;
	  }
	  return 1;
	} else if(c == 'V') {
	  return 5;
	} else if(c == 'X') {
	  if(lastChar == 'L' || lastChar == 'C') {
		return -10;
	  }
	  return 10;
	}else if(c == 'L') {
	  return 50;
	} else if(c == 'C') {
	  if(lastChar == 'D' || lastChar == 'M') {
		return -100;
	  }

	  return 100;
	} else if(c == 'D') {
	  return 500;
	} else {
	  return 1000;
	}
  }

  public static int getNumber(String s) {
	int res = 0;
	char lastChar = 0;
	  
	for(int i = s.length() - 1; i >= 0; i--) {
	  char c = s.charAt(i);
	  res += getNum(c, lastChar);
	  lastChar = c;
	}
	return res;
  }
  public static void main(String[] args) {
	String s = "LVIII";
	System.out.println(getNumber(s));
  }
}
