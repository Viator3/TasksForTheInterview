package sorts;

import java.util.Arrays;

public class MergingSortedArrays {
    public static int[] Merger(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int index = 0, aIndex = 0, bIndex = 0; index < result.length; index++) {
            if (aIndex == a.length || bIndex == b.length) {
                if (aIndex == a.length) {
                    System.arraycopy(b, bIndex, result, index, (b.length - bIndex));
                    break;
                }
                if (bIndex == b.length) {
                    System.arraycopy(a, aIndex, result, index, (a.length - aIndex));
                    break;
                }
            }
            if (a[aIndex] < b[bIndex]) {
                result[index] = a[aIndex++];
            } else {
                result[index] = b[bIndex++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {0, 2, 7, 9, 123};
        int[] b = {1, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(Merger(a, b)));
    }
}
