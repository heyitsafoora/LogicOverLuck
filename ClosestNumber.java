// import java.util.Scanner;

// public class ClosestNumber{
//     public static int closestN(int n, int m){

//         //Find Quotient
//         int closest = 0; //initially we are taking answer as 0
//         int minDifference = Integer.MAX_VALUE; //if more than two answers, we will choose this variable - 'minDifference', which has the Max Abosolute value number.
        
//         //Check numbers around n
//         for(int i = n - Math.abs(m); i <= n + Math.abs(m); i++){
//             if(i % m == 0){
//                 int difference = Math.abs(n - i);
//                 if(difference <= minDifference && Math.abs(i) > Math.abs(closest)){
//                     closest = i;
//                     minDifference = difference;
//                 }
//             }
//         }
//         return closest;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter values of n,m : ");
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         System.out.print(closestN(n, m));   
//     }
// }

// public class ClosestNumber {

//     public static int closestN(int n, int m) {
//         int q = n / m;

//         int n1 = m * q;        // first possible closest
//         int n2 = m * (q + 1);  // second possible closest

//         // Check which one is closer
//         if (Math.abs(n - n1) < Math.abs(n - n2)) {
//             return n1;
//         } else {
//             return n2;
//         }
//     }

//     public static void main(String[] args) {
//         int n = 13, m = 4;
//         System.out.println(closestN(n, m));
//     }
// }


//To work for both negetaive and posiive nos
public class ClosestNumber {
    public static int closestN(int n, int m) {
        int q = n / m;

        int n1 = m * q;
        int n2 = (n * m > 0) ? m * (q + 1) : m * (q - 1);

        if (Math.abs(n - n1) < Math.abs(n - n2)) {
            return n1;
        } else {
            return n2;
        }
    }
    public static void main(String[] args) {
        int n = -13, m = 4;
        System.out.println(closestN(n, m));
    }
}