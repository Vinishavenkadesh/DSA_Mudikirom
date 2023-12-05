import java.util.*;
public class D_FibonnaciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long sum = 0;
        long a = 0;
        long b = 1;
        // int i = 2;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i = 2;i<=num;i++){
           sum = a+b;
           a = b;
           b = sum;
           System.out.print(sum + " ");
        }
        // while(i<=num){
        //     sum = a+b;
        //     a=b;
        //     b=sum;
        //     i++;
        // }
        // System.out.println(sum);
    }
}
