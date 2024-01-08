// int start = 0;
// int end = chIndex;

// while(start < end) {
//     char temp = charr[start];
//     charr[start] = charr[end];
//     charr[end] = temp;
//     start++;
//     end--;
// }

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}