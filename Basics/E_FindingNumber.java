import java.util.*;
public class E_FindingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numToFind = sc.nextInt();
        int sum = 0;
        while(num>0){
            int rem = num%10;
            if(rem==numToFind)
            sum++;
            num = num/10;
        }
        System.out.println(sum);
    }
}