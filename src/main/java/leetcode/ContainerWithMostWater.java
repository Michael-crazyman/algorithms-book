package leetcode;

public class ContainerWithMostWater {

    public static int maxArea(int[] height){
        int maxArea = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int currentArea;
            if (height[i] < height[j]) {
                currentArea = height[i] * (j - i);
                i ++;
            } else if (height[i] > height[j]) {
                currentArea = height[j] * (j - i);
                j --;
            } else {
                currentArea = height[j] * (j - i);
                i++;
                j--;
            }

            maxArea = Math.max(currentArea, maxArea);
        }
        return maxArea;
    }

    public static void test1() {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }

    public static void main(String[] args) {
        test1();
    }
}
