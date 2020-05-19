import java.util.Scanner;

public class chapter_3 {

    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int first, second;
        System.out.print("First Number: ");
        first = keyboard.nextInt();
        System.out.print("Second Number: ");
        second = keyboard.nextInt();
        if (second == first) {
            System.out.println("Same Numbers");
        } else if (second > first) {
            System.out.println("Second greater than first");
        } else {
            System.out.println("First greater than second");
        }

        int n1, n2, sum;
        System.out.print("First number: ");
        n1 = keyboard.nextInt();
        System.out.print("Second number: ");
        n2 = keyboard.nextInt();
        System.out.print("Guess the sum: ");
        sum = keyboard.nextInt();
        if (sum == n1 + n2) {
            System.out.println("Great!");
        } else {
            System.out.println("Bad!");
            System.out.println("Corect value: " + (n1 + n2));
        }

        double weight, height, bmi;
        System.out.print("Weight: ");
        weight = keyboard.nextDouble();
        System.out.print("Height: ");
        height = keyboard.nextDouble();
        bmi = (weight / (height*height));
        System.out.println("BMI: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi > 24.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Healthy");
        }

        int screen, ant, prnt;
        double price;
        System.out.print("What screen do you want?\n38cm [1]\n43cm [0]\n");
        screen = keyboard.nextInt();
        System.out.print("Antivirus? [0 / 1]: ");
        ant = keyboard.nextInt();
        System.out.print("Printer? [1 / 0]: ");
        prnt = keyboard.nextInt();
        price = 375.99 + (screen * 75.99 + (1 - screen) * 99.99) + ant * 65.99 + prnt * 125;
        System.out.println("Final Price: " + price);

        char bank;
        double money;
        System.out.print("Account: ");
        bank = keyboard.next().toUpperCase().charAt(0);
        System.out.print("Money: ");
        money = keyboard.nextInt();
        switch(bank) {
            case 'X':   if (money >= 5000) System.out.println(1.05 * money);
                        break;
            case 'A': case 'C': if (money >= 250) System.out.println(1.015 * money);
                                break;
            case 'B':   if (money >= 1000) System.out.println(1.02 * money);
                        break;
        }

        keyboard.close();

    }

}