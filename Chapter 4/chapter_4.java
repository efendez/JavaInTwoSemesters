/*

Consider a vending machine that offers the following options:
    [1] Get gum
    [2] Get chocolate
    [3] Get popcorn
    [4] Get juice
    [5] Display total sold so far
    [6] Quit
Design and implement a program that continuously allows users to select from these options. When options 1–4 are selected an appropriate message is to be displayed acknowledging their choice. For example, when option 3 is selected the following message could be displayed:
    Here is your popcorn 
When option 5 is selected, the number of each type of item sold is displayed. For example:
    3 items of gum sold
    2 items of chocolate sold
    6 items of popcorn sold
    9 items of juice sold
When option 6 is chosen the program terminates. If an option other than 1–6 is entered an appropriate error message should be displayed, such as: Error, options 1-6 only!

*/

import java.util.Scanner;

public class chapter_4 {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        /*
        int limit;
        System.out.print("Limit? ");
        limit = keyboard.nextInt();
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            } else {
                System.out.println(i + " is odd.");
            }
        }*/

        /*for (int i = 0; i < 3; i++) {
            System.out.println("* * * * *");
        }*/

        /*for (int i = 0; i < 6; i++) {
            if (i == 2 | i == 3) {
                System.out.println("* * * * * *");
            } else {
                System.out.println("* * *");
            }
        }*/

        /*for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*int table;
        char valid;
        do {
            System.out.print("Table: ");
            table = keyboard.nextInt();
            if (table < 2) {
                System.out.print("Not a valid number.");
            } else {
                for (int i = 0; i < 13; i++) {
                    System.out.println(i + " x " + table + " = " + (i * table));
                }
            }
            System.out.print("Repeat? [Y / N] ");
            valid = keyboard.next().toUpperCase().charAt(0);
        } while (valid == 'Y');*/

        /*int num;
        char again;
        do {
            System.out.print("Size of square? ");
            num = keyboard.nextInt();
            if (num < 2 || num > 20) {
                System.out.println("Not valid");
            } else {
                for(int i = 1; i <= num; i++) {
                    for (int j = 1; j <= num; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            System.out.println("Another go? [Y/N]");
            again = keyboard.next().toUpperCase().charAt(0);
        } while (again == 'Y');*/
        
        /*int option;
        int gum = 0, choco = 0, chips = 0, candy = 0;
        do {
            System.out.println("[1] Gum");
            System.out.println("[2] Chocolate");
            System.out.println("[3] Chips");
            System.out.println("[4] Candy");
            System.out.println("[5] Display Total");
            System.out.println("[6] Checkout");
            System.out.print("Option? ");
            option = keyboard.nextInt();
            if (option < 0 || option > 6) {
                option = 0;
                System.out.println("Index must be lower than 7 and greater than 0");
            } else {
                switch (option) {
                    case 1:
                        gum++;
                        break;
                    case 2:
                        choco++;
                        break;
                    case 3:
                        chips++;
                        break;
                    case 4:
                        candy++;
                        break;
                    case 5:
                        System.out.println("Gum: " + gum);
                        System.out.println("Choco: " + choco);
                        System.out.println("Candy: " + candy);
                        System.out.println("Chips: " + chips);
                    default:
                        break;
                }
            }
        } while (option < 6);*/

        keyboard.close();

    }
}