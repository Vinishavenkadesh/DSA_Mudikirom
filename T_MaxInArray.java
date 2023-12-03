import java.util.*;

public class T_MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 18, 67, 32, 23, 11, 2, 34, 65, 78 };
        System.out.println(max(arr));
        System.out.println(maxIndex(arr,5,2));
    }

    static int max(int[] arr) {
        if (arr.length == 0)
            return -1;

        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    static int maxIndex(int[] arr, int start, int end) {

        if(arr == null)
        return -1;

        if (start > end)
            return -1;

        int max = arr[start];
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

}
