package A_BinarySearch;

public class M_RotationCount {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        // int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        // int[] arr = { 2, 5, 6, 0, 0, 1, 2 };
        System.out.println(pivotNonDuplicates(arr) + 1);
        // System.out.println(pivotDuplicates(arr) + 1);
        // output = 2
    }

    public static int pivotNonDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (end > mid && arr[mid] > arr[mid + 1])
                return mid;
            if (start < mid && arr[mid - 1] > arr[mid])
                return mid - 1;
            if (arr[start] < arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static int pivotDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            if (start < mid && arr[mid] < arr[mid - 1])
                return mid - 1;
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (end > start && arr[start] > arr[start + 1])
                    return start;
                start++;
                if (end > start && arr[end - 1] > arr[end])
                    return end - 1;
                end--;
            }
            if (arr[mid] < arr[start] || arr[start] == arr[mid] && arr[mid] > arr[end])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
