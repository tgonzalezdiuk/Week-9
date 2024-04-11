/**********
 * Tamara Gonzalez
 * Date : April 4th, 2024 ;)
 * Program : Java
 */

import java.util.*;
public class GameTwentyOne
{
    public static void main(String[] args)
    {
        int NumOne = 0;
        int NumTwo = 0;
        int Sum = 0;
        int NumThree = 0;
        int SumTwo = 0;
        int DealerOne = 0;
        int DealerTwo = 0;
        int DealerThree = 0;
        int DealerSum = 0;

        NumOne = (int)(10*Math.random()) +1;
        NumTwo = (int)(10*Math.random()) +1;
        Sum = (NumOne + NumTwo);

        System.out.println("You have a " + NumOne + "and a " + NumTwo + "for a total of " + Sum);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 1 if you want another card or any other number for no card.");
        int Choice = input.nextInt();

        NumThree = (int)(10*Math.random()) +1;
        SumTwo = (NumOne + NumTwo + NumThree);
        
        if (Choice == 1) 
        {
            System.out.println("You got a " + NumThree + " for a total of " + SumTwo);
        }

        DealerOne = (int)(10*Math.random()) +1;
        DealerTwo = (int)(10*Math.random()) +1;
        DealerThree = (int)(10*Math.random()) +1;
        DealerSum = (DealerOne + DealerTwo + DealerThree);
        
        System.out.println("The dealer has a " + DealerOne + "," + DealerTwo + ", and " + DealerThree + " for a total of " + DealerSum)

        if (SumTwo > 21)
        {
            System.out.println("You Lose");
        }
        else if (SumTwo < DealerSum && SumTwo <= 21)
        {
            System.out.println("You Lose");
        }
        else if (SumTwo > DealerSum && SumTwo <=210)
        {
            System.out.println("You Win");
        }
        else if (Dealer Sum > 21 && SumTwo <= 21)
        {
            System.out.println("You Win")
        }
        else if (DealerSum == SumTwo)
        {
            System.out.println("Tie")
        }

        input.close();
    }
}
