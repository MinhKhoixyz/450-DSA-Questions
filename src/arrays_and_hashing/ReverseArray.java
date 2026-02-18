package arrays_and_hashing;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int x = arr.length;
        System.out.println("Array length: " + x);

        int[] temp = new int[x];
        for (int i = 0; i < x; i++) {
            temp[i] = arr[x - i - 1];
        }
        for (int i = 0; i < x; i++) {
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
