import java.util.Random;

/**
 * Created by brandonmazzarella on 6/1/17.
 */
public class StakeCalculator
{
    public static void main (String[] args)
    {
        Random rand = new Random();

        int startingStack = 50;
        int stakeNumber = 1;
        int higestCashStack = startingStack;

    for(int i = 0; i < 1000; i++) {
        if (stakeNumber == 1) {
            int n = rand.nextInt(2) + 1;
            if (n == 1) {
                startingStack = startingStack + 1;

            } else {
                startingStack = startingStack - 1;
                stakeNumber = 2;
            }

        }
        if (stakeNumber == 2) {
            int n = rand.nextInt(2) + 1;
            if (n == 1) {
                startingStack = startingStack + 1;
                stakeNumber = 1;

            } else {
                startingStack = startingStack - 1;
                stakeNumber = 3;
            }
        }
            if(stakeNumber == 3)
            {
                int n = rand.nextInt(2) + 1;
                if(n == 1)
                {
                    startingStack = startingStack + 5;
                    stakeNumber = 1;
                }else
                {

                    startingStack = startingStack - 5;
                    stakeNumber = 1;
                }

            }
            if(higestCashStack < startingStack)
            {
                higestCashStack = startingStack;
            }
            System.out.println("Stake Number: " + i + " Current Cash Stack: " + startingStack);



    }
            System.out.println("The highest your cash stack was: " + higestCashStack);
    }

}

