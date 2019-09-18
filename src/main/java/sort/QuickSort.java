package sort;

public class QuickSort {

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            swap(arr, left + (int)(Math.random() * (right -left + 1)), right);
            int[] p = partition(arr, left, right);
            quickSort(arr, left, p[0] - 1);
            quickSort(arr, p[1], right);
        }
    }

    public static int[] partition(int[] arr, int left, int right) {
        int less = left - 1;
        int pivot = arr[right];
        int more = right;
        int currentIndex = left;

        while (currentIndex < more) {
            if (arr[currentIndex] < pivot) {
                swap(arr, ++less, currentIndex++);
            } else if (arr[currentIndex] > pivot) {
                swap(arr, --more, currentIndex);
            } else {
                currentIndex ++;
            }
        }
        swap(arr, more, right);

        return new int[]{less + 1, more};
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }


    public static void print(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 8, 11, 6, 1, 2, 5};
        quickSort(arr, 0, arr.length - 1);

        print(arr);
    }
}
