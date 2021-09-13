/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Julio Lopez
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Enter a noun: " );
        Scanner s = new Scanner(System.in);
        String noun = s.nextLine();
        System.out.println("Enter a verb: ");
        String verb = s.nextLine();
        System.out.println("Enter an adjective: ");
        String adj = s.nextLine();
        System.out.println("Enter an adverb: ");
        String adv = s.nextLine();
        System.out.println("Do you " + verb + " your " + adj + " " + noun + " " + adv + "? That's hilarious!");
    }
}
