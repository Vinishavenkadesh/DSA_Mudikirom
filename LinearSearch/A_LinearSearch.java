package LinearSearch;

import java.util.*;

public class A_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Target Element : ");
        int target = sc.nextInt();

        int[] arr = { 12, 34, 56, 76, 54, 88, 33 };
        System.out.println(linearSearchIndex(arr, target));
        System.out.println(linearSearchTarget(arr, target));
        System.out.println(linearSearchBoolean(arr, target));

    }

    // returning index
    static int linearSearchIndex(int[] arr, int target) {
        if (arr == null)
            return -1;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target)
            return i;
        }
        return -1;
    }

    // returning target
    static int linearSearchTarget(int[] arr, int target) {
        if (arr.length == 0)
            return Integer.MIN_VALUE;
        for (int i : arr) {
            if (i == target)
                return i;
        }
        return Integer.MAX_VALUE;
    }

    static boolean linearSearchBoolean(int[] arr, int target) {

        if (arr.length == 0)
            return false;

        for (int i : arr) {
            if (target == i)
                return true;
        }
        return false;
    }
}
