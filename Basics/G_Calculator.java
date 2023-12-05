import java.util.*;
public class G_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     while(true){
        System.out.print("Enter the Character : ");
        char ch = sc.next().trim().charAt(0);
        int ans = 0;
        if(ch == '+' ||ch == '-' ||ch == '*' ||ch == '/' ||ch == '%'){
            System.out.print("Enter two Operator : ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if(ch=='+'){
               ans = num1+num2;
               System.out.println(ans);
            }
            else if(ch=='-'){
               ans = num1-num2;
               System.out.println(ans);
            }
            else if(ch=='*'){
               ans = num1*num2;
               System.out.println(ans);
            }
            else if(ch=='%'){
               ans = num1%num2;
               System.out.println(ans);
            }
            else if(ch=='/'){
                if(num2!=0){
               ans = num1%num2;
               System.out.println(ans);
            }
            }
        }
        else if(ch=='x' || ch=='X'){
            break;
        }
        else{
            System.out.println("Ivalid Character!");
        }
     }
    }
}
