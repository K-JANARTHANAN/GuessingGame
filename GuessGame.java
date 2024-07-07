import java.util.Random;
import java.util.Scanner;
class GuessGame{
    public static void main(String args[])
    {
        Random Ran =new Random();
        Scanner sc=new Scanner(System.in);
        int RandomNumber=Ran.nextInt(101);
        int score=100;
       
        while(true)
        {
         System.out.println("Enter Your Guess Number Between(1-100):");
         score=score-10;
         int playerGuess=sc.nextInt();
        if(playerGuess==RandomNumber) {
        System.out.println("Correct! You Win!");
      
        System.out.println("Your Score is:"+score);
        break;
        }
        else if(playerGuess<RandomNumber)
        System.out.println("nope! The number is Greater"); 
        else
        System.out.println("nope! The number is Lesser");
        if(score<0)
        {
            System.out.println("you are Out");
            break;
        }
    
        }
         sc.close();
    
       
    }
}