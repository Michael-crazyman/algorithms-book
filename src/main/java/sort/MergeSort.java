package sort;

import java.util.concurrent.TimeUnit;

/**
 * Created by Michael on 19/9/16.
 */
public class MergeSort {

    public static void mergeSort(int[] arr) throws InterruptedException {
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int left, int right) throws InterruptedException {
        System.out.println("left = "+ left + ", right = "+ right);
        if (left  == right) {
            return;
        }
        int mid = left + (right - left) / 2;
        System.out.println("mid = " + mid);

        mergeSort(arr, left, mid);
        System.out.println("Left completed!");
        System.out.println(arr[left]);

        mergeSort(arr, mid + 1, right);
        System.out.println("Right completed!");
        System.out.println(arr[right]);

        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        System.out.println("left = "+ left + ", right = "+right + ", mid = "+ mid);
        if (arr == null || arr.length < 2) {
            return;
        }
        int[] helper = new int[right - left + 1];
        int currentIndex = 0;
        int p1 = left;
        int p2 = mid + 1;

        while(p1 <= mid && p2 <= right) {
            helper[currentIndex ++] = arr[p1] < arr[p2] ? arr[p1 ++] : arr[p2 ++];
        }

        while (p1 <= mid) {
            helper[currentIndex ++] = arr[p1 ++];
        }

        while(p2 <= right) {
            helper[currentIndex ++] = arr[p2 ++];
        }

        for (int i = 0; i < helper.length; i++) {
            arr[left + i] = helper[i];
            System.out.println("helper[" + i + "] = " + helper[i]);
        }
    }

    public static void print(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {6,7,5,4,1,9,0,8,3};
        mergeSort(arr);
        print(arr);
    }
}
