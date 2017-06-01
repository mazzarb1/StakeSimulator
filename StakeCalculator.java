import java.util.Random;
import java.util.Scanner;

/**
 * Created by brandonmazzarella on 6/1/17.
 */
public class StakeCalculator
{
    public static void main (String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);




        int stakeNumber = 1;
        int cashHigh = 50;

        boolean won = true;
        int winStreak = 0;
        int highestWin = 0;
        int loseStreak = 0;

        System.out.println("Hello, how many rounds would you like to stake?");
        int timesStaking = scan.nextInt();
        System.out.println("How much money are you going to start with?");
        int startingStack = scan.nextInt();



        for(int i = 1; i <= timesStaking; i++) {
            int n = rand.nextInt(2) + 1;

            if(won)
            {
                winStreak = winStreak + 1;
            }

            if(startingStack > cashHigh)
            {
                cashHigh = startingStack;
            }

            if(highestWin < winStreak)
            {
                highestWin = winStreak;
            }

            if(startingStack < 1)
            {
                System.out.println("");
                System.out.println("You ran out of money on round: " + (i-1));
                i = timesStaking + 1;

            }


            if(stakeNumber == 1 && n == 1)
            {
                startingStack = startingStack + 1;

            }else if (stakeNumber == 1 && n == 2)
            {
                startingStack = startingStack - 1;
                stakeNumber = 2;
                winStreak = 0;
            }else if(stakeNumber == 2 && n == 1)
            {
                startingStack = startingStack + 1;
                stakeNumber = 1;
            }else if (stakeNumber == 2 && n == 2 && startingStack >= 6)
            {
                startingStack = startingStack - 1;
                stakeNumber = 3;
                winStreak = 0;
            }else if (stakeNumber == 3 && n == 1)
            {
                startingStack = startingStack + 5;
                stakeNumber = 1;

            }else if (stakeNumber == 3 && n == 2) {
                startingStack = startingStack - 5;
                stakeNumber = 1;
                winStreak = 0;
            }

            if(i < timesStaking) {
                System.out.println("Stake Round: " + i + " Ending Cash Stack: " + startingStack);
            }
        }
            System.out.println("The highest amount of money you had was: " + cashHigh);
            System.out.println("Your highest winning streak was: " + highestWin);
    }

}

