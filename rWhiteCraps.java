
/**
 * Write a description of class rWhiteCraps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rWhiteCraps
{
    public static void main(String[] args)
    {
        Die d1 = new Die();
        Die d2 = new Die();
        
        
        int total = d1.roll() + d2.roll();
        
        if (total == 7 || total == 11)
        {
            //win
        }
        else if ( total == 2 || total == 3 || total == 12)
        {
            //lose
        }
        else 
        {
            int point = total; 
            total = d1.roll() + d2.roll();
            while (total != 7 && total != point)
            {
                //roll again
                total = d1.roll() + d2.roll();
            }
            if (total == 7)
            {
                System.out.println("You lose.");
            }
            else 
            {
                System.out.println("You win.");
            }
        }
    }
}