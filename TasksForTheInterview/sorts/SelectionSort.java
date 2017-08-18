package sorts;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int min = barrier;
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[min] > arr[index]) {
                    min = index;
                }
            }
            int tmp = arr[barrier];
            arr[barrier] = arr[min];
            arr[min] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 1, 5, 2};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
