import java.util.*;

public class S_SwapInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 18, 67, 32, 23, 11, 2, 34, 65, 78, 90 };
        int index1 = 0;
        int index2 = arr.length - 1;

        // for(int i = 0;i<arr.length;i++){
        // arr[i] = sc.nextInt();
        // }

        System.out.println(Arrays.toString(arr));
        swap(arr, index1, index2);
        System.out.println(Arrays.toString(arr));
        revSwap(arr, index1, index2);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void revSwap(int[] arr, int start, int end) {
        if (arr == null)
            System.out.println(-1);

        while (end > start) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
