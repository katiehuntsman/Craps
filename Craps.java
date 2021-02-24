
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
        System.out.println("1. Roll two six-sided dice.");
        System.out.println("2. a. On first roll, if you get a 7 or 11 you win!");
        System.out.println("   b. On first roll, if you get a 2, 3, or 12 you lose!");
        System.out.println("   c. Any other number you don't win or lose. The die roll becomes your 'point.'");
        System.out.println("3. Keep rolling the dice again until:");
        System.out.println("4. a. You roll the point again and win!");
        System.out.println("   b. or you roll a 7 and lose.");
    }

    public static int userRoll()
    {
        Die die = new Die();
        Scanner in = new Scanner(System.in);
        System.out.println("Press <Enter> to roll. ");
        String pause = in.nextLine();
        int rolls = die.roll() + die.roll();
        System.out.println("You rolled: " + rolls);
        return rolls;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like to play Craps? (Y/n) ");
        String play = in.nextLine(); 
        if (play.equals("") || play.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.print("Would you like instructions? (Y/n) ");
            String inst = in.nextLine();
            if (inst.equals("") || inst.substring(0,1).equalsIgnoreCase("y"))
            {   
                instructions();
            }
            System.out.println();
            System.out.println("Good luck!");
            System.out.println();
        }
        while (play.equals("") || play.substring(0,1).equalsIgnoreCase("y"))
        {
            int rolls = userRoll();

            if (rolls == 7 || rolls == 11)
            {
                System.out.println("You win! Wow, first try.");
            }
            else if (rolls == 2 || rolls == 3 || rolls == 12)
            {
                System.out.println("You lose!");
            }
            else
            {
                System.out.println("That's your point.");
                System.out.println("Let's see if you can roll it again before you roll a 7!");
                int point = rolls;   //saves as point value 
                rolls = userRoll();  //new roll

                while (rolls != point && rolls != 7)
                {
                    rolls = userRoll();   //keeps rolling
                }
                if (rolls == 7)
                {
                    System.out.println("You lose.");
                }
                else
                {
                    System.out.println("You win!");
                }
            }
            System.out.print("Would you like to play again? (Y/n): ");
            play = in.nextLine();
        }

        System.out.println("See you next time! Gambling is bad, kids. Peace.");
    }
}


/* 

COMMENTS FROM THE INSTRUCTOR:

Such clean code here in this version of the game. Nicely done, from
the default (Y/n) feature to the "Gambling is bad" message at the end.
Nicely done!

SCORE: 16/15

*/

