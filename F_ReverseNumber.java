import java.util.*;
public class F_ReverseNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int ans = 0;
    while(num>0){
        int rev = num%10;
        ans = ans*10+rev;
        num=num/10;
    }
    System.out.println(ans);
  } 
}