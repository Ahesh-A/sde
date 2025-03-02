public class KthElement {
  public static int getKthEleBinary(int[] a, int[] b, int k) {
	int n1 = a.length;
	int n2 = b.length;
	int n = n1 + n2;
	int low = Integer.max(0, k - n2);
	int high = Integer.min(k, n1);
	
	if(n1 > n2) {
	  return getKthEleBinary(b, a, k);
	}
	while(low <= high) {
	  int mid1 = (low + high) / 2;
	  int mid2 = k - mid1;

	  int l1 = mid1 > 0 ? a[mid1 - 1] : Integer.MIN_VALUE;
	  int l2 = mid2 > 0 ? b[mid2 - 1] : Integer.MIN_VALUE;
	  int r1 = mid1 < n1 ? a[mid1] : Integer.MAX_VALUE;
	  int r2 = mid2 < n2 ? b[mid2] : Integer.MAX_VALUE;

	  if(l1 <= r2 && l2 <= r1) {
		return Integer.max(l1, l2);
	  } else if (l1 > r2) {
		high = mid1 - 1;
	  } else {
		low = mid1 + 1;
	  }

	System.out.println(l1 + " " + l2 + " " + r1 + " " + r2);
	}
	return 0;
  }

  public static int getKthElement(int[] a, int[] b, int k) {
	int i = 0;
	int j = 0;
	int res = -1;
	int count = -1;
	int lenA = a.length;
	int lenB = b.length;

	if(lenA + lenB < k) {
	  return -1;
	}
	
	while(i < lenA && j < lenB) {
	  if(count == k - 1) {
		return res;
	  }
	  if(a[i] > b[j]) {
		res = b[j++];
	  } else {
		res = a[i++];
	  }

	  count++;
	}
	System.out.println(i + " " + j + " " + count);
	
	if(i != lenA) {
	  return a[k - j - 1];
	} else {
	  return b[k - i - 1];
	}
  }
  public static void main(String[] args) {
	int[] a = {1, 3, 5, 6, 11, 12, 13, 14};
	int[] b = {2, 4, 7, 8, 9, 10};
	int k = 7;
	System.out.println(getKthEleBinary(a, b, k));
  }
}
