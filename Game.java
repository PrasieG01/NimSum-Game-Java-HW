/*****************************************
 * A template for a Nim game
 ****************************************/ 
import java.util.Random;


public class Game{

    private static int marbles; //size
    private Human humanPlayer;
    private Computer computerPlayer;
    private boolean isComputerTurn;
    
    public Game(int difficulty)
    {
        marbles = (int) (Math.random()* 91 + 10); //generates a random integer between 10 - 100
        this.humanPlayer = new Human();
        this.computerPlayer = new Computer(difficulty); 
        this.isComputerTurn = true;

    }
     
    public void play()
    {  

      System.out.println("Starting size of the marbles: " + marbles);
      
        while(marbles > 1)
      {
        if(isComputerTurn)
      {
        computerPlayer.move(marbles);
        marbles -= computerPlayer.getChoice();
        System.out.println("Computer takes " + computerPlayer.getChoice() + " marbles."); 
      } 
        else
      {
        humanPlayer.move();
        marbles -= humanPlayer.getChoice();
        System.out.println("Human takes " + humanPlayer.getChoice() + " marbles.");

      }
       System.out.println("Marbles left: " + marbles);
       isComputerTurn = !isComputerTurn; //switch turns
   
     }

    if(isComputerTurn)
   {
     System.out.println("Computer takes the last marble. Human wins!!");
   } 
    else
    {
     System.out.println("Human takes the last marble. Computer wins!!");
    }
   
    }

    public static int getMarbles()
   {
       return marbles;
   }

}







