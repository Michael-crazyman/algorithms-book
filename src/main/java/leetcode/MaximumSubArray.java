package leetcode;

/**
 * Created by Michael on 19/10/7.
 */
public class MaximumSubArray {

    public static int maxSubArray(int[] nums){
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int cur = 0;
        int sum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            cur += nums[i];
            sum = Math.max(cur, sum);
            cur = cur < 0 ? 0 : cur;
        }

        return sum;
    }

    public static void test1() {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};//should be 6

        System.out.println(maxSubArray(arr));
    }

    public static void main(String[] args) {
        test1();
    }
}
