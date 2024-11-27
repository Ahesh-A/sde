import java.util.Set;

public class LongestConse {
	public static int longestConse(int[] nums) {
		 if(n == 0) {
            return 0;
        }
        int res = 1;

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        for(int ele: set) {
            if(!set.contains(ele - 1)) {
                int count  = 1;
                int temp = ele;
                while(set.contains(temp + 1)) {
                    count++;
                    temp = temp + 1;
                }
                res = Integer.max(res, count);
            }
        }

        return res;

	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		System.out.println(longestConse(arr));
	}
}
