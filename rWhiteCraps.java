
/**
 * Mr. White's version of Craps from the lecture.
 *
 * @author Richard White
 * @version 2021-02-04
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