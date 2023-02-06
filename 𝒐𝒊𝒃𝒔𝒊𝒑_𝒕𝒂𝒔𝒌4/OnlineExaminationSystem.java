/*

Name : Ishwar Hanumant Sanap
Task : Online Examination System.

*/

import java.io.*;
import java.util.*;


public class OnlineExaminationSystem 
{
    Scanner input = new Scanner(System.in);
    HashMap<String, Integer> data = new HashMap<String, Integer>();

    public void login() 
    {
        data.put("Ishwar", 123456);
        data.put("ishwar", 123456);

        System.out.println("\n\n-----Welcome to online exam portal-----\n");

        String userid ="";
        int pwd = 0;

        System.out.println("Login to continue.....");
        System.out.print("Enter user id : "); userid = input.next();
        System.out.print("Enter password : ");pwd = input.nextInt();

        if (data.containsKey(userid) && data.get(userid) == pwd) 
        {
            System.out.println("Login sucessful .....\n");
            option_menu();

        }
        else 
        {
            System.out.println("SORRY!!! Invalid Login ...");
            
            System.out.println("Want to create new account ? [Y/N]");
            String newAc = input.next();

            if(newAc.equalsIgnoreCase("y"))
            {
                System.out.print("Enter Your Name : "); String Name = input.nextLine();
                input.nextLine();
                System.out.print("Enter User Id : "); String uid = input.next();
                System.out.print("Enter password : ");pwd = input.nextInt();
                data.put(uid, pwd);

                System.out.println("Account Created sucessful ..");
                login();
            }
            
            else
            {
                System.out.println("Try again");
                login();
            }
            
        }
    }

    public void option_menu() {
        int select;
        System.out.println("Enter the option you want to perform");
        System.out.println("1.Update profile and password");
        System.out.println("2.Start the exam");
        System.out.println("3.Logout");
        select = input.nextInt();

        switch (select) 
        {
            case 1:
                data = update();
                option_menu();
                break;
            case 2:
                exam_que();
                option_menu();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid entry");
        }
    }

    public HashMap<String, Integer> update() {
        String uuser;
        int upwd;
        System.out.println("Welcome to Update profile");
        System.out.println("Enter user name");
        uuser = input.next();

        if (data.containsKey(uuser)) 
        {
            System.out.println("Enter new password you to want to update to your profile");
            upwd = input.nextInt();
            data.replace(uuser, upwd);

            System.out.println("Profile Updated successfully ...");

        } else {
            System.out.println("User doesn't exist");
        }
        return data;
    }

    public void exam_que() 
    {
        long examtime = System.currentTimeMillis();
        long endtime = examtime + (1000*30);
        int ans_count = 0;
        int ans=0, score=0;

        System.out.println("Start the exam");

   
            System.out.println("Instructions :");
            System.out.println("=============================================\n");
            System.out.println("You have 30 seconds to answer 5 questions");
            System.out.println("Each question carries 10 marks" + " " + "-5 for wrong answer");
            
            System.out.println("Time Reamaining : "+(endtime - System.currentTimeMillis())/1000F+" sec");
            if(System.currentTimeMillis() < endtime)
            {

                System.out.println("\n\nQ1. What is the extension of java code files ?");
                System.out.println("\n1).js" + "\t" + "2).java" + "\t" + "3).txt" + "\t" + "4).html");
                System.out.println("Enter correct option");
                ans = input.nextInt();
                System.out.println("Answer Locked...");
    
                if (ans == 2) {
                    ans_count++;
                }
            }

            if(System.currentTimeMillis() < endtime)
            {
                System.out.println("Time Reamaining : "+(endtime - System.currentTimeMillis())/1000F+" sec");
                System.out.println("\n\nWhich component is used to compile, debug and execute the java programs?");
                System.out.println("1)JRE" + "\t" + "2)JDK" + "\t" + "3)JVM" + "\t" + "4)JIT");
                System.out.println("Enter correct option");
                ans = input.nextInt();
                System.out.println("Answer Locked...");
                if (ans == 2) {
                    ans_count++;
                }
            }

            if(System.currentTimeMillis() < endtime)
            {
                
                System.out.println("Time Reamaining : "+(endtime - System.currentTimeMillis())/1000F+" sec");
                System.out.println("\n\nWho invented Java Programming?");
                System.out.println("1)James Gosling" + "\t" + "2)Bjarne Stroustrup" + "\t" + "3)Guido van Rossum" + "\t"
                        + "4)Dennis Ritchie");
                System.out.println("Enter correct option");
                ans = input.nextInt();
                System.out.println("Answer Locked...");
                if (ans == 1) {
                    ans_count++;
                }
            }

            if(System.currentTimeMillis() < endtime)
            {
                
                System.out.println("Time Reamaining : "+(endtime - System.currentTimeMillis())/1000F+" sec");
                System.out.println("\n\nWhich one of the following is not a Java feature?");
                System.out.println("1) Dynamic and Extensible" + "\t" + "2) Portable" + "\t" + "3) Object-oriented" + "\t"
                        + "4) Use of pointers");
                System.out.println("Enter correct option");
                ans = input.nextInt();
                System.out.println("Answer Locked...");
                if (ans == 4) {
                    ans_count++;
                }
            }

            if(System.currentTimeMillis() < endtime)
            {
                System.out.println("Time Reamaining : "+(endtime - System.currentTimeMillis())/1000F+" sec");
                
                System.out.println("\n\nWhich of the following is not an OOPS concept in Java?");
                System.out.println(
                        "1) Compilation" + "\t" + "2) Encapsulation" + "\t" + "3) Inheritance" + "\t" + "4) Polymorphism");
                System.out.println("Enter correct option");
                ans = input.nextInt();
                System.out.println("Answer Locked...");
                if (ans == 1) {
                    ans_count++;
                }
            }

        System.out.println("\nYou have finished the exam");
        score = ans_count * 10 - ((5 - ans_count) * 5); // Score Counting
        System.out.println("Your score is..." + " " + score + "/50");
    }

    public static void main(String[] args) 
    {   
        OnlineExaminationSystem log = new OnlineExaminationSystem();
        log.login(); 
    }
}