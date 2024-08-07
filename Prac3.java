import java.util.*;
import java.lang.Math;
class Prac3_1 {
    public static void main(String[] args) {
        //Simple Interest
        Scanner sj = new Scanner(System.in);
        System.out.println("Enter Roi, Principle, Time");
        double R = sj.nextDouble();
        double P = sj.nextDouble();
        double T = sj.nextDouble();
        System.out.println("Enter the options:" );
        System.out.println("1. Simple Interest");
        System.out.println("2. EMI");
        System.out.println("3. Amount");
        int choice = sj.nextInt();
        if (choice == 1) {
            double SI = (P * R * T) / 100;
            System.out.println("Simple Interest is: " + SI);
        } else if (choice == 2) {
            double EMI = (P * R * Math.pow(1 + R, T)) / (Math.pow(1 + R, T) - 1);
            System.out.println("EMI is: " + EMI);
        } else if (choice == 3) {
            double A = P * Math.pow(1 + R, T);
            System.out.println("Amount is: " + A);
        } else {
            System.out.println("Invalid choice");
        }
        sj.close();
    }
}

class Prac3_2 {
    public static void main(String[] args) {
        int S = 8;
        int L = 3;
        int M = 0;
        System.out.println("At the Start: ");
        System.out.println("S = " + S);
        System.out.println("L = " + L);
        System.out.println("M = " + M);
        M += 2;
        S -= 2;
        M += 2;
        L -= 2;
        M -= 3;
        M -= 1;
        S += 1;
        System.out.println("At the End: ");
        System.out.println("S = " + S);
        System.out.println("L = " + L);
        System.out.println("M = " + M);
    }
}
