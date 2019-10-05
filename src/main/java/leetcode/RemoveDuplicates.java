package leetcode;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums){
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void test1() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));// should be 5
    }

    public static void test2() {
        int[] nums = {1};
        System.out.println(removeDuplicates(nums));// should be 1
    }

    public static void test3(){
        int[] nums = {1, 2};
        System.out.println(removeDuplicates(nums));// should be 2
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }
}
