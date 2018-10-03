/*
 *Jessica Qiao,02/10/2018.
 */

package shopping;
import java.util.Scanner;
/**
 *
 * @author shqia0005
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        double num1, num2, num3;
        double total1, total2, total3;
        double p1 = 19.99;
        double p2 = 49.99;
        double p3 = 25.99;
        
        System.out.println("Enter the number of USB storage you would like to purchase ");
        num1 = keyedInput.nextDouble();
        System.out.println("Enter the number of Keyboard you would like to purchase ");
        num2 = keyedInput.nextDouble();
        System.out.println("Enter the number of Computer Mouse you would like to purchase ");
        num3 = keyedInput.nextDouble();
        
        total1 = num1 * p1;
        total2 = num2 * p2;
        total3 = num3 * p3;
        
        System.out.println("The total of USB storage is $" + total1 + ".");
        System.out.println("The total of Keyboard is $" + total2 + ".");
        System.out.println("The total of Computer Mouse is $" + total3 + ".");
        
    }
    
}
