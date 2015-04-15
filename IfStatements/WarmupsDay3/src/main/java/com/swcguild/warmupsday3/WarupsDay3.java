/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.warmupsday3;

import java.util.Scanner;

/**
 *
 * @author ilyagotfryd
 */
public class WarupsDay3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        String strAge = sc.nextLine();
        int age = Integer.parseInt(strAge);
        
        if(age<18)
        {
            System.out.println("You must be in school");
        }else if(age<65)
        {
            System.out.println("Time to go to work!");
        }else{
            System.out.println("Enjoy your retirement.");
        }
    }
    
}
