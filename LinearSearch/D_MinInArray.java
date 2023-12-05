package LinearSearch;
import java.util.*;
public class D_MinInArray {
    public static void main(String[] args) {
        int [] arr = {};
        minInArray(arr);
    }
    static void minInArray(int [] arr){

        if(arr.length == 0)
        System.out.println(Integer.MIN_VALUE);
        else{
        int min = arr[0];
        for(int i : arr){
            if(i<min)
            min = i;
        }
        System.out.println(min);
    }
}
}
