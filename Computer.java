/*****************************************
 * A template for a computer Nim player
 ****************************************/ 
import java. util. Random;
public class Computer{
    
    private int mode;
    private int choice;
    private boolean isHard;
    
    public Computer(int m){
        mode = m;

        if(m == 1)
        {
            isHard = true;
        }
        choice = -1;
    }
    
    public void move(int marblesLeft)
    {
    
    if(isComputerTurn && choice >= 1 && choice <= Game.getMarbles() / 2)
    {
        computerPlayer.stupidMove();
    }
    else
    {
        if(Game.getMarbles() != Math.sqrt(2) - 1)
        {
            Math.random()*(Game.getMarbles()/2) + 1;

        }else
        {
            computerPlayer.smartMove();
                    
        }        

        }
      
    }

public int smartMove(!isHard) //smart move
    {
        int[] powers = {3, 7, 15, 31, 63};
        for( int target: powers)
        {
            if(target <= Game.getMarbles() && target >= Game.getMarbles() / 2)
            {
                return target;
            }
        }
        return 1; // Default to a legal move if no target was found

    }

    public int stupidMove(isHard) //stupid Move
     {

    return (int) Math.random()*(Game.getMarbles() / 2) + 1;
   }


    public int getChoice(){
        return choice;
    }

}
