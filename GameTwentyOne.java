/**********
 * Tamara Gonzalez
 * Date : April 4th, 2024 ;)
 * Program : Java
 */

public class GameTwentyOne
{
    public static void main(String[] args)
    {
        int NumOne = 0;
        int NumTwo = 0;
        int sum = 0;

        NumOne = (int)(10*Math.random()) +1;
        NumTwo = (int)(10*Math.random()) +1;
        sum = (NumOne + NumTwo);

        System.out.println("You have a " + NumOne + "and a " + NumTwo + "for a total of " + sum);
    }
}