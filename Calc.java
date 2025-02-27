import java.util.Scanner;
public class Calc{

    public static void main(String[] args) {
        int sum;
        int div;
        int mult;
        int subt;
        int a ;
        int b ;



        
        Scanner hi = new Scanner(System.in);
        System.out.println("enter one number");
        a = hi.nextInt();
        
        System.out.println("enter the second number");
        b = hi.nextInt();

        //Scanner.close();

        subt= a - b;
        mult= a * b;
        div= a / b;
        sum= a + b;

        System.out.println("Sum is "+sum);
        System.out.println("the difference between the numbers is "+subt);
        System.out.println("multiplication of the numbers "+mult);
        System.out.println("Division of the number "+div);

    }
} 