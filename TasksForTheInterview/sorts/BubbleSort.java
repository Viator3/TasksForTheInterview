package sorts;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 4, 1, 5, 2};
        for (int arrayLength = array.length, flag = 0; arrayLength > 1; arrayLength --) {
            for (int index = 0; index < arrayLength - 1; index++) {
                if (array[index] > array[index + 1]) {
                    flag = 1;
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
            if (flag == 0) {
                break;
            } else {
                flag = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
