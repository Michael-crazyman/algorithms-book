package leetcode;

/**
 * Created by Michael on 19/10/13.
 */
public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        double res;
        if (nums1 == null || nums1.length == 0) {
            if (nums2.length % 2 == 0) {
                return (double)(nums2[nums2.length / 2] + nums2[nums2.length / 2 - 1]) / 2;
            } else {
                return (double)nums2[nums2.length / 2];
            }
        }

        if (nums2 == null || nums2.length == 0) {
            if (nums1.length % 2 == 0) {
                return (double)(nums1[nums1.length / 2] + nums1[nums1.length / 2 - 1]) / 2;
            } else {
                return (double)nums1[nums1.length / 2];
            }
        }

        int index1 = 0;
        int index2 = 0;
        int[] newArr = new int[nums1.length + nums2.length];
        int index = 0;
        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] < nums2[index2]) {
                newArr[index++] = nums1[index1++];
            } else if (nums1[index1] > nums2[index2]){
                newArr[index++] = nums2[index2 ++];
            } else {
                newArr[index ++] = nums1[index1++];
                newArr[index ++] = nums2[index2++];
            }
        }

        if (index1 == nums1.length && index2 < nums2.length) {
            while (index2 < nums2.length) {
                newArr[index++] = nums2[index2 ++];
            }
        } else if (index2 == nums2.length && index1 < nums1.length) {
            while (index1 < nums1.length) {
                newArr[index ++] = nums1[index1 ++];
            }
        }

        if (newArr.length % 2 == 0) {
            res = (double)(newArr[newArr.length / 2] + newArr[newArr.length / 2 - 1]) / 2;
        } else {
            res = (double)newArr[newArr.length / 2];
        }

        return res;
    }

    public static void test1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static void test2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static void test3() {
        int[] nums1={};
        int[] nums2 = {1};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static void test4() {
        int[] nums1 = {3,4};
        int[] nums2 = {};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();

        test4();
    }
}
