
/**
 * The Craps program simulates an interactive game of craps. 
 *
 * @author Katie Huntsman
 * @version 2021-02-02
 */
import java.util.Scanner;

public class Craps
{
    public static void instructions()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like instructions? (Y/N)");
        String inst = in.nextLine();
        if (inst.substring(0,1).equalsIgnoreCase("y") || inst.equals(""))
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
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Die die = new Die();
        String play = "y"; 
        int roll = 0;
        int point = 0; 
        System.out.print("Let's play Craps! ");
        instructions();

        while (play.equalsIgnoreCase("y"))
        {
            //first roll 
            System.out.println("Press <Enter> to roll. ");
            String pause = in.nextLine();
            System.out.println("Your first roll is: " + roll);

            if (roll == 7 || roll == 11)
            {
                System.out.println("You win!");
            }
            else if (roll == 2 || roll == 3 || roll == 12)
            {
                System.out.println("You lose!");
            }
            else
            {
                System.out.println("That's your point.");
                System.out.println("Let's see if you can roll it again before you roll a 7!");
                
                
            }

            System.out.print("Would you like to play again? (Y/N): ");
            play = in.next();
        }
        System.out.println("Thanks for playing! Gambling is bad, kids. Peace.");
    }
}