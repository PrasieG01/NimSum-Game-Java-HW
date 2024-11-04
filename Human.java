/*****************************************
 * A template for a Human Nim player
 ****************************************/ 
import java.util.Scanner;

public class Human{
   
    private int choice;
    private Scanner input;
    
    public Human(){
        input= new Scanner(System.in);
        choice = -1;
    }
    
    public void move()
    {
       System.out.println("How many marbles will you take? : ");
        choice = input.nextInt();   
        if(choice >= 1 && choice <= Game.getMarbles() / 2)  
        {
            System.out.println("You took " + choice + " marbles.");
        } else
        {
    System.out.println("Invalid move. Enter a number between 1 and " + Game.getMarbles() /2 + " :");
       choice = input.nextInt();
        } 
     }
    
    
    public int getChoice(){
        return choice;
    }

}
    
    


