import java.util.*;
public class H_SwitchCase {
  public static void main(String[] args) {
     Scanner sc =  new Scanner(System.in);
     int empId = sc.nextInt();
    
     switch(empId){
        case 1:
        System.out.println("Vinisha Venkadesh");
        break;
        case 2:
        System.out.println("Vineetha Rohit");
        break;
        case 3:
        System.out.println("You entered empId as 3");
        System.out.print("Enter Department : ");
        String dept = sc.next();
        switch(dept){
            case "IT" :
            System.out.println("IT Department");
            System.out.print("Enter section : ");
            char section = sc.next().trim().charAt(0);
            switch(section){
                case 'A':
                System.out.println("You belongs to section A");
                break;
                case 'B':
                System.out.println("You belongs to section B");
                break;
                default:
                System.out.println("Enter correct section");
            }
            break;
            case "ECE" :
            System.out.println("ECE Department");
            break;
            default:
            System.out.println("Enter correct department");
        }
        break;
        default:
        System.out.println("Enter correct empId");
     }

  } 
}