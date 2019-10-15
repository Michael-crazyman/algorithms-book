package random;

public class FindingTheMax {

    public static int findMax(int[] arr){
        return findMax(arr, 0, arr.length - 1);
    }

    private static int findMax(int[] arr, int start, int end){
        if (start == end) {
            return arr[start];
        }

        int mid = start + (end - start) / 2;
        int leftMax = findMax(arr, start, mid);
        int rightMax = findMax(arr, mid + 1, end);

        return Math.max(leftMax, rightMax);

    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,100};
        System.out.println(findMax(arr));
    }
}
