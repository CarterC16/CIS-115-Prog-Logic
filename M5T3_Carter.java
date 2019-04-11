/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5t3_carter;

import java.util.Scanner;

/**
 *
 * @author carterc1652
 */
public class M5T3_Carter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        showMenu();
        //get number
        int menu =getInt();
                
    }
    public static void showMenu(){
        System.out.println(" what number? ");
        System.out.println( "1. Greetings!" );
        System.out.println( "2. Double a number" );
        System.out.println( "3. Take 10%" );
        System.out.println( "4. Gross Pay" );
        System.out.println( "5. Extra Choice" );
        
    }
    public static int getInt(){
        int num;
        //get number
        Scanner keyb = new Scanner (System.in);
        num =keyb.nextInt();
        
        return num; 
    }
}

