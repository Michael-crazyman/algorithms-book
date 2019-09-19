package sort;

public class HeapSort {

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length <= 0) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0) {
            heapify(arr, 0, heapSize);
            swap(arr, 0, --heapSize);
        }
    }

    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    public static void heapify(int[] arr, int currentIndex, int size) {
        int left = currentIndex * 2 + 1;

        while (left < size) {
            int largestIndex = (left + 1) < size && (arr[left] > arr[left + 1]) ? left : (left + 1);
            largestIndex = arr[largestIndex] > arr[currentIndex] ? largestIndex : currentIndex;

            if (largestIndex == currentIndex) {
                break;
            }
            swap(arr, largestIndex, currentIndex);
            currentIndex = largestIndex;
            left = currentIndex * 2 + 1;
        }

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
        int[] arr = {10, 8, 11};

        heapSort(arr);
        print(arr);
    }
}
