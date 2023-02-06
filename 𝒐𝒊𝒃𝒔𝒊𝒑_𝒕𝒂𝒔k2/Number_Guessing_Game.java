/*

Name : Ishwar Hanumant sanap
Task : Number Guessing Game
*/

import java.util.Random;
import java.util.Scanner;
class Number_Guessing_Game
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        Random robj = new Random(); // creating the object of the random class for generiating the random values

        int guess = 0 , rand = 0;

        String ch = ""; 
    
        int attempts = 1;
        do
        {
            attempts = 1;

            //Generating the random value
            rand = robj.nextInt(100);
            // System.out.println("Random value : "+rand);

            // User entering the value
            System.out.print("Guess the number between [0 - 100] : ");
            guess = sobj.nextInt();
    
            
            while(guess != rand)
            {

                if (guess > rand)
                {
                    System.out.print("Your Guess is large .... \nplease guess the smaller value : ");
                    guess = sobj.nextInt();
                    attempts++;
                }
        
                else if (guess < rand)
                {
                    System.out.print("Your Guess is small .... \nplease guess the large value : ");
                    guess = sobj.nextInt();
                    attempts++;
                }

                if(attempts > 10)
                {
                    System.out.println("your limit is over for the guessing the number ..");
                    break;
                }
            }
            
            //cheking the value
             if(guess == rand)
             {
                 System.out.println("==============================================================\n");
                 System.out.println("Congratulations !!! \nYou guess the number correctly in "+attempts+" attempts !!");
                 System.out.println("==============================================================\n");
                 System.out.print("Do you want to play again ?? [Y/N] : ");
                 ch = sobj.next();   
             }


        }while(  !ch.equals("N") &&  !ch.equals("n") && attempts <=10 );

        System.out.println("Thank you... !!!");
    
        
    }
}