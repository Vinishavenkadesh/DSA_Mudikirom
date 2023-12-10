package A_BinarySearch;

import java.util.*;

public class C_OrderAgnosticsBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { -89, -66, -55, 0, 1, 3, 54, 65, 76, 87, 98 };
        // int[] arr = { 98, 87, 76, 65, 54, 43, 32, 11, 0, -1, -32 };

        System.out.print("Enter Target : ");
        int target = sc.nextInt();
        if (arr[0] < arr[arr.length - 1]) {
            System.out.print("Ascending index : ");
            System.out.println(ascendingBS(arr, target));
        } else {
            System.out.print("Descending index : ");
            System.out.println(decendingBS(arr, target));
        }

    }

    static int ascendingBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid])
                start = mid + 1;
            else if (target < arr[mid])
                end = mid - 1;
            else
                return mid;
        }
        return -1;

    }

    static int decendingBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid])
                end = mid - 1;
            else if (target < arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
