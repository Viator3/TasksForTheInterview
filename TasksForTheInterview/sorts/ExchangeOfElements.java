package sorts;

import java.util.Arrays;

public class ExchangeOfElements {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        for (int index = 0, barrier = array.length / 2; index < barrier; index++) {
            int temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
