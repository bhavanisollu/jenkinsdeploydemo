package com.lti.jenkinsdeploy;

import java.util.Scanner;

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
    
    public void Subtraction(int a , int b){
        int res = a - b;
        System.out.println("a - b is "+res);
    }
    
    public void multipication(int a , int b){
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
        Scanner sc = new Scanner(system.in);
        System.out.println( "Enter 1st no : " );
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter 2nd no : ");
        int b = sc.nextInt();
        sc.nextLine();
        
        System.out.println( "Enter your choice.\n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division" );
        int ch = sc.nextInt();
        
        switch(ch){
            case 1:
                addition(a,b);
                break;
            case 2:
                subtraction(a,b);
                break;
            case 3:
                multiplication(a,b);
                break;
            case 4:
                division(a,b);
                break;
            default:
                System.out.println("Hello! please enter from above choices only");
                break;
        }
    }
}
