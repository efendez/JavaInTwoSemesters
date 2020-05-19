import java.util.Scanner;

public class chapter_5 {

    static double convert(double pounds) {
        return pounds / 2.2;
    }

    static double get_area(double l1, double l2) {
        return l1 * l2;
    }

    static double get_perimeter(double l1, double l2) {
        return (l1 * 2) + (l2 * 2);
    }

    static double read_money() {
        System.out.print("Money / Rate: ");
        Scanner reader = new Scanner(System.in);
        double read = reader.nextDouble();
        reader.close();
        return read;
    }

    static double read_convert(double money, double rate) {
        return money / rate;
    }

    static void read_display(double cnv) {
        System.out.println("Conversion: " + cnv);
    }

    static double convert_temp(int resp) {
        Scanner get_data = new Scanner(System.in);
        double temp;
        System.out.print("Temperature: ");
        temp = get_data.nextDouble();
        get_data.close();
        switch (resp) {
            case 1:
            if (temp > -273.15) {
                return (9*temp/5) + 32;
            } else {
                System.out.println("Are you cold?");
                return 0;
            }
            case 2:
            if (temp > -459.67) {
                return 5*(temp - 32)/9;
            } else {
                System.out.println("Are you cold?");
                return 0;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
    
        Scanner keyboard = new Scanner(System.in);
        /*double pounds;
        System.out.print("Pounds: ");
        pounds = keyboard.nextDouble();
        System.out.println("Kilos: " + convert(pounds));*/

        /*double side, base;
        System.out.print("Side: ");
        side = keyboard.nextDouble();
        System.out.print("Permieter: ");
        base = keyboard.nextDouble();
        System.out.println("Area: " + get_area(side, base));
        System.out.println("Permieter: " + get_perimeter(side, base));*/
        
        /*double money_sum, money_rate;
        do {
            money_sum = read_money();
            money_rate = read_money();
            read_display(read_convert(money_sum, money_rate));
            System.out.print("Again? Y/N ");
        } while (keyboard.nextLine().toUpperCase().charAt(0) == 'Y');*/

        /*int response;
        double res;
        do {
            System.out.println("[1] Centigrades to Farenheit");
            System.out.println("[2] Farenheit to Centigrades");
            System.out.println("[3] Exit");
            System.out.print("Choice: ");
            response = keyboard.nextInt();
            if (response <= 3 || response >= 1) {
                switch (response) {
                    case 1: case 2:
                        res = convert_temp(response);
                        System.out.println("Conversion: " + res);
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Response must be between 1 and 3");
            }
        } while (response != 3);*/

        keyboard.close();

    }
}