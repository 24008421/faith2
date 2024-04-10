import java.util.Scanner;
public class compoundinterest {
    
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        double Amount;
        double I;
        double P;
        double N;

        System.out.println("Enter  prencipal amount");
        P = scan.nextDouble();
        System.out.println("enter period");
        N = scan.nextDouble();
        System.out.println("enter interest");
        I = scan.nextDouble();
        I = I/100;
        Amount = P * Math.pow((1 + I), N);

        System.out.println("YOUR ANSWER IS : " + Amount);

    }
}


