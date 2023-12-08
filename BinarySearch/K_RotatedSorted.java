package BinarySearch;

public class K_RotatedSorted {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
        
    }

    public static int search(int [] arr, int target){
        int pivot = pivot(arr);
        if(target == pivot)
        return pivot;
        else if(pivot == -1)
        return binarySearch(arr, target, 0, arr.length - 1);
        int firstTry = binarySearch(arr, target, 0, pivot-1);
        if(firstTry!= -1)
        return firstTry;
        else
        binarySearch(arr, target, pivot+1, arr.length - 1);
        return -1;
    }
    
    public static int pivot(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(end > mid + 1 && arr[mid] > arr[mid+1])
            return mid;
            else if(start < mid - 1 && arr[mid] < arr[mid - 1])
            return mid - 1;
            else if(arr[start] > arr[mid])
            end = mid - 1;
            else
            start = mid + 1; 
        }
        return -1;
    }

    public static int binarySearch(int [] arr,int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid])
            start = mid + 1;
            else if(target < arr[mid])
            end = mid - 1;
            else 
            return mid;
        }
        return -1;
    }
}
