public class Test {
  public static void main(String[] args) {
	float num = 9;

	for(int i = 0; i < 10; i++) {
	  num /= 2;
	  System.out.println((long)(num * 1000000) / 1000000f);
	}
  }
}
