import java.util.*;
public class M_Array {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int [] arr = new int[5];
    // for(int i = 0;i<arr.length;i++){
    //     arr[i] = sc.nextInt();
    // }

    // for(int i : arr){
    //     System.out.print(i + " ");
    // }
    // System.out.println();

    // System.out.println(Arrays.toString(arr));

    String [] arrString = new String[5];
    for(int i = 0;i<arrString.length;i++){
         arrString[i] = sc.next();
    }

    for(String arr : arrString){
        System.out.print(arr + " ");
    }
    System.out.println();

    System.out.println(Arrays.toString(arrString));
}    
}