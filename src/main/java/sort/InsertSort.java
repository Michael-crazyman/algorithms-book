package sort;

public class InsertSort {

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return ;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j --) {
                swap(arr, j, j + 1);

            }
        }
    }

    private static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void test1() {
        int[] arr = {6,7,1,2,3};

        insertSort(arr);

        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test1();
    }
}
