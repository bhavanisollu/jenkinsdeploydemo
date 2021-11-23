package com.lti.jenkinsdeploy;

//import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public void addition(int a , int b){
        int res = a + b;
        System.out.println("a + b is "+res);
    }
    
    public void subtraction(int a , int b){
        int res = a - b;
        System.out.println("a - b is "+res);
    }
    
    public void multiplication(int a , int b){
        double res = a * b;
        System.out.println("a * b is "+res);
    }
    
    public void division(int a , int b){
        double quo = a / b;
        double rem = a % b;
        System.out.println("Quotient is "+quo);
        System.out.println("Remainder is "+rem);
    }
    
    public static void main( String[] args )
    {   
        //Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my Calculator!");
        System.out.println( "1st no is : a = 8" );
        int a = 8;
        //sc.nextLine();
        System.out.println("2nd no is : b = 5");
        int b = 5;
        //sc.nextLine();
        
        App obj = new App();
        obj.addition(a,b);
        obj.subtraction(a,b);
        obj.multiplication(a,b);
        obj.division(a,b);
        
        /*
        System.out.println( "Enter your choice.\n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division" );
        int ch = sc.nextInt();
        
        switch(ch){
            case 1:
                obj.addition(a,b);
                break;
            case 2:
                obj.subtraction(a,b);
                break;
            case 3:
                obj.multiplication(a,b);
                break;
            case 4:
                obj.division(a,b);
                break;
            default:
                System.out.println("Hello! please enter from above choices only");
                break;
        }
        */
    }
}
