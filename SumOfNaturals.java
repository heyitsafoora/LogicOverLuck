import java.util.Scanner;
public class SumOfNaturals {
    public static int SumNaturals(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int result = SumNaturals(n);
        System.out.println("Sum = " + result);
        sc.close();
    }
}
