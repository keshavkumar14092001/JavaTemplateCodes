import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int len = scr.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scr.nextInt();
        }
        scr.close();

        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
