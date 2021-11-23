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
        System.out.println( "Hello Again!!" );
    }
}
