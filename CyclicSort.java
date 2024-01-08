import java.util.*;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        for (int i = 0; i < arr.length; i++) {
            while (arr[arr[i] - 1] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[arr[i] - 1] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
