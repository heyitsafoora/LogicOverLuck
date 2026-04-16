import java.util.*;
public class EvenOrOdd{
        
    public static boolean isEven(int n){    
        int rem = n % 2;
        if(rem == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(isEven(n) == true){
            System.out.print("true");
        } else {
            System.out.print("false");
        }
        sc.close();
    }
}