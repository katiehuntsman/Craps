
/**
 * The Craps program simulates an interactive game of craps. 
 *
 * @author Katie Huntsman
 * @version 2021-02-02
 */
import java.util.Scanner;

public class Craps
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String play = "y"; 
        int r1 = 0;
        int r2 = 0; 
        int point = 0; 
        String inst = "n";
        System.out.print("Let's play craps!");
        
        //instructions 
        System.out.print("Would you like instructions? (Y/N)");
        inst = in.next();
        if (inst.equalsIgnoreCase("y"))
        {
            System.out.println("1. Roll two six-sided dice.");
            System.out.println("2. a. On first roll, if you get a 7 or 11 you win!");
            System.out.println("   b. On first roll, if you get a 2, 3, or 12 you lose!");
            System.out.println("   c. Any other number you don't win or lose. The die roll becomes your 'point.'");
            System.out.println("3. Keep rolling the dice again until:");
            System.out.println("4. a. You roll the point again and win!");
            System.out.println("   b. or you roll a 7 and lose.");
        }
        System.out.println();
        System.out.println("Good luck!");
        System.out.println();
        
        
        while (play.equalsIgnoreCase("y"))
        {
            //first roll 
            
            
            System.out.print("Would you like to play again? (Y/N): ");
            play = in.next();
        }
    }
}