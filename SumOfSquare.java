import java.util.Scanner;
public class SumOfSquare {
    public static int Summ(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i * i;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int result = Summ(n);
        System.out.print("Sum of squares of first " + n + " natural numbers is : " + result);
        sc.close();
    }
}
