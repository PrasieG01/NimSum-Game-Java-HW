/*****************************************
 * A template for a computer Nim player
 ****************************************/ 
import java. util. Random;
public class Computer{
    
    private int mode; // 1 for stupid, 2 for smart
    private int choice;
    private boolean isHard;

    public Computer(int m){
        mode = m;

        if(m == 1)  
        {
            isHard = false;
        }
        choice = -1;
    }
    
    public void move(int marblesLeft)
    {
    
    if(isHard)
    {
        choice = smartMove(marblesLeft);
    } else
    {
        choice = stupidMove(marblesLeft);
    }
    }

public int smartMove(int marblesLeft) //smart move
    {
        int[] powers = {3, 7, 15, 31, 63};
        for( int target: powers)
        {
            if(target <= Game.getMarbles() && Game.getMarbles() - target >= Game.getMarbles() / 2)
            {
               return Game.getMarbles() - target;           
            }
        }
        return 1; // Default to a legal move if no target was found

    }

    public int stupidMove(int marblesleft) //stupid Move
     {

    return (int) (Math.random()*(Game.getMarbles() / 2) + 1);
   }


    public int getChoice(){
        return choice;
    }

}
