  import java.util.Arrays;
  
  public class MooreNBy2 {
      public static int moore(int[] arr) {
          int count = 1;
          int elem = arr[0];
 		int n = arr.length; 
          for(int i = 1; i < n; i++) {
              if(arr[i] == elem) {
                  count ++;
              } else {
                  if(count == 1) {
                      elem = arr[i];
                  } else {
                      count --;
                  }
              }
          }
  
          count = 0;
          for(int i = 0; i < n; i++) {
              if(arr[i] == elem) {
                  count ++;
              }
          }
  
         if(count > n / 2) {
             return elem;
         }
 
         return -1;
     }
     public static void main(String[] args) {
         int[] arr = {2, 2, 1, 1, 1, 2, 2, 1, 1, 3, 1, 1};
           System.out.println(moore(arr));
      }
  }
