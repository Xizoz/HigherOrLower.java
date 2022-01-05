package com.company;


import java.util.Scanner;

// I den ovenstående linje importer jeg Java util scanner, så den kan scanne det input som brugeren indtaster.

public class HigherOrLower {

    public static void main(String[] args) {

        int number = (int)(1 + Math.random() * 99);
        // I den ovenstående linje beder jeg programmet om at vælge et tilfældigt tal mellem 1 og 99.

        System.out.println("I am thinking of a number between 1 & 99, can you guess it?");
        System.out.println("If you can guess, you can have a special price!");
        System.out.println("Please write a whole number and press enter ;)");
        // I de to ovenstående linjer, printer jeg ud til terminalen og beder brugeren om at taste et helt tal, og derefter trykke på enter.


        Scanner scanner = new Scanner(System.in);

        int guesses = 0;
        boolean done = false;
        while(!done){

            int playerGuess = scanner.nextInt();
            guesses++;
            // Det ovenstående tæller hvor mange gæt brugeren bruger for at gætte det tilfældige tal.

            if(number < playerGuess){
                System.out.println("The number I am thinking of is lower than " + playerGuess + ".");
                System.out.println("Try again!");
            }
            // Det ovenstående kode bliver "aktiveret" hvis det bruger indstastede tal er højere end det tilfældige tal som programmet har valgt.


            else if(number > playerGuess){
                System.out.println("The number I'm thinking of is higher than " + playerGuess + ".");
                System.out.println("Try again!");
            }
            // Dette ovenstående kode bliver "aktiveret", hvis det bruger indstastede tal er lavere end det tilfældige tal.

            else{
                System.out.println("You guessed it, the number was: " + number + ".");
                System.out.println("It took you " + guesses + " tries to guess the correct number!");
                System.out.println("Thank you for playing my Higher or Lower game, and here is your price!: shorturl.at/fhoF8 ");
                done = true;
            }
            // Dette stykke kode bliver "aktiveret" hvis det bruger indsastede tal er det samme som det tilfældige tal, samt får brugeren af vide hvor mange gæt de har brugt.
        }

        scanner.close();
    }




    }

