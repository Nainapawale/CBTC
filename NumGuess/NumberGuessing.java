import java.util.Scanner;
import java.util.Random;

public class NumberGuessing
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    String play="Yes";
    int round=0,TotalScore=0,TotalTries=0;
    System.out.println();
    System.out.println("A number is chosen between 1 to 100, Guess the number within 5 tries.");//x
    while(play.equals("Yes"))//anObject
    {
        ++round;
        int guess,i,k=5,tries=0,score=5;
        Random rand=new Random();
        int number=rand.nextInt(100);//bound
        for(i=0;i<k;i++)
        {
        System.out.println();
        System.out.print("Guess the number: ");//s

        guess=sc.nextInt();
        if(number==guess)
        {
        tries++;
        System.out.println("Congratulation! You guessed the number.");//x
        System.out.println();
        System.out.println("\nTries: " +tries);
        System.out.println("Score: " +score);
        TotalTries += tries;
        TotalScore += score;
        System.out.println();
        System.out.println("Would you like to play again? Yes or No: ");//s
        play=sc.next().toLowerCase();
        break;  
        }
        else if(number>guess && i!=k-1)
        {
        System.out.println("The number is greater than " +guess);
        tries++;
        score--;
        }
        else
        {
        System.out.println("The number is less than " +guess);
        tries++;
        score--;
        }
        }
        if(i==k)
        {
        System.out.println("You have exhausted 5 tries.");
        System.out.println("The number was " +number);
        TotalTries += tries;
        TotalScore += score;
        System.out.println("\nTries: " +tries);
        System.out.println("Score: " +score);
        System.out.println();
        System.out.print("Would you like to play again? Yes or No: ");//s
        play=sc.next().toLowerCase();
        }
    }
 System.out.println("\nRounds: " +round);
 System.out.println("Toatl Tries: " +TotalTries);
 System.out.println("Total Score: " +TotalScore);
}
}