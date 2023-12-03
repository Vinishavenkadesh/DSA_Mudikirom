package Searching;
import java.util.*;
public class C_SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start and End range : ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.print("Enter the target : ");
        int target = sc.nextInt();
        int [] arr = {11,22,33,44,55,66,77,88,99,100};

        System.out.println(searchInRange(arr, start, end, target));
    }

    static int searchInRange(int [] arr,int start,int end,int target){
        if(start>end)
        return -1;
        for(int i = start;i<=end;i++){
            if(target == arr[i])
            return i;
        }
        return -1;
    }
}
