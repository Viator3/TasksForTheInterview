package sorts;

import java.util.Arrays;

public class InsertionSorting {
    public static void sort(int[] arr) {
        for (int barrier = 1; barrier < arr.length; barrier++) {
            int newElement = arr[barrier];
            int index = barrier - 1;
            while (index >= 0 && arr[index] > newElement) {
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = newElement;
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 1, 5, 2};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
