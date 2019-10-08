package leetcode;

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0;
        int end = nums.length;
        int mid;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (target > nums[mid]){
                start = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            } else {
                break;
            }
        }

        mid = start + (end - start) / 2;

        if (mid < nums.length && nums[mid] < target) {
            return mid + 1;
        }

        return mid;
    }


}
