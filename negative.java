/**********
 * Tamara Gonzalez
 * Date : April 4th, 2024 ;)
 * Program : Java
 */

 public class negative
 {
     public static void main(String[] args)
     {
        int NumOne = 0;
        int NumTwo = 0;
        int NumThree = 0;
        int NumFour = 0;
        int sum = 0;
        
        NumOne = (int)(8*Math.random()) -3;
        NumTwo = (int)(8*Math.random()) -3;
        NumThree = (int)(8*Math.random()) -3;
        NumFour = (int)(8*Math.random()) -3;

        sum = (NumOne + NumTwo + NumThree + NumFour);
        
        System.out.println(NumOne);
        System.out.println(NumTwo);
        System.out.println(NumThree);
        System.out.println(NumFour);

        System.out.println("Sum : " + sum);

        if(sum < 0)
        {
            System.out.println("Negative");
        }
        else 
        {
            System.out.println("Not Negative");
        }


     }
 }