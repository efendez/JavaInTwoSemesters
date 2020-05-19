import java.util.Scanner;

public class chapter_2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double price, tax;
        System.out.println("-----  PROGRAM  -----");
        System.out.print("Price: ");
        price = keyboard.nextInt();
        System.out.print("Tax: ");
        tax = keyboard.nextDouble();
        price = price * (1 + tax/100);
        System.out.println(price);
        
        final int YEAR = 2020;
        int age, bornIn;
        System.out.print("How old are you? ");
        age = keyboard.nextInt();
        bornIn = YEAR - age;
        System.out.println("Born in: " + bornIn);

        double h_rect, l_rect;
        System.out.print("Height: ");
        h_rect = keyboard.nextDouble();
        System.out.print("Length: ");
        l_rect = keyboard.nextDouble();
        System.out.println("Area: " + h_rect * l_rect);

        double pounds;
        System.out.print("Pounds: ");
        pounds = keyboard.nextDouble();
        pounds = pounds / 2.2;
        System.out.println("Kilos: " + pounds);

        int students, size;
        System.out.print("Students: ");
        students = keyboard.nextInt();
        System.out.print("Team size: ");
        size = keyboard.nextInt();
        System.out.println("Teams: " + students / size);
        System.out.println("Left out: " + students % size);

        keyboard.close();
    }

}