public class LongestPrefix {
  public static boolean isCommonPrefix(String str, String[] arr) {
	for(String elem : arr) {
	  if(!elem.startsWith(str)) {
		return false;
	  }
	}
	return true;
  }

  public static String getCommonPrefix(String[] arr) {
	if(arr.length == 0) {
	  return "";
	}

	String prefix = arr[0];

	int low = 0;
	int high = prefix.length();
	int prefixLen = 0;

	while(low <= high) {
	  int mid = low + (high - low) / 2;
	  if(isCommonPrefix(prefix.substring(0, mid), arr)) {
		low = mid + 1;
		if(mid > prefixLen) {
		  prefixLen = mid;
		}
	  } else {
		high = mid - 1;
	  }
	}
	System.out.println(prefixLen);
	return prefix.substring(0, prefixLen);
  }
  public static void main(String[] args) {
	String[] arr = {"dog", "rececar", "car"};
	System.out.println(getCommonPrefix(arr));
  }
}
