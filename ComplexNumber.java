import java.util.Scanner;
/**
 * Lab 9 ComplexNumber.
 *
 * @author  Qurrat-al-Ain Siddiqui
 * 
 */
public class ComplexNumber
{
    private double real;
    private double imaginary;
    private double sum;
    
    public void run ()
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter a real number");
        real = keyboard.nextDouble();
        
        System.out.println("Please enter an imaginary number");
        imaginary = keyboard.nextDouble();
        
        sum = real + imaginary;
        
        System.out.println(real + "+" + imaginary + "*" + sum);
    }
}
