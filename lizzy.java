import java.util.Scanner;

public class lizzy{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        int z;
        System.out.println("enter your first integer ");
        x = scan.nextInt();
        System.out.println("enter your second integer");
        y = scan.nextInt();
        z = x-y;
        System.out.print("your answer is:--"+z);
    }
        

    
}