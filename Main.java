
/**
 * @author ()
 * @version (Version 1)
 */

import java.util.Scanner;
public class Main
{
    public Main()
    {
        System.out.print("\f");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        //Assesment
        System.out.println("Enter a Number: ");
        int first = reader.nextInt();
        System.out.println("You Entered the Number " + first);
        
        System.out.println("");
        
        System.out.println("Enter a Second Number: ");
        int second = reader.nextInt();
        System.out.println("You Entered the Number " + second);
        System.out.println("");
        //Mathematics
        int add = (first + second);
        int sub = (first - second);
        int mul = (first * second);
        int div = (first / second);
        int mod = (first % second);
        double hyp = Math.pow(first,2) + Math.pow(second,2);
        
        
        
        
        
        
        //Final Print
        System.out.println("Additon = " + add);
        System.out.println("Subtraction = " + sub );
        System.out.println("Multiplication = " + mul);
        System.out.println("Integer Division = " + div);
        System.out.println("Modulus = "+ mod);
        System.out.println("Hypotenuse of triangle if 1st & 2nd are legs = " + hyp);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
