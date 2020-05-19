import java.util.Scanner;

public class chapter_6 {

    static void increaseMarks(int[] arrayIn) {
        for (int i = 0; i < arrayIn.length; i++) {
            arrayIn[i] = arrayIn[i] + 5;
        }
    }
    static boolean allHavePassed(int[] arrayIn) {
        boolean boo = true;
        int i = 0;
        while (boo && i < arrayIn.length) {
            if (arrayIn[i] < 40) {
                boo = false;
            }
            i++;
        }
        return boo;
    }

    static void fillArray(int[] arrayIn) {
        Scanner keyboard = new Scanner (System.in);
        for (int i = 0; i < arrayIn.length; i++) {
            System.out.print("enter value ");
            arrayIn[i] = keyboard.nextInt();
        }
        keyboard.close();
    }

    static int sum (int[] arrayIn) {
        int total = 0;
        for (int currentElement : arrayIn) {
            total = total + currentElement;
        }
        return total;
    }

    static int max (int[] arrayIn) {
        int result = arrayIn[0];
        for (int i=1; i < arrayIn.length; i++) {
            if (arrayIn[i] > result) {
                result = arrayIn[i];
            }
        }
        return result;
    }

    static boolean contains (int valueIn, int... arrayIn) {
        for (int currentElement : arrayIn) {
            if (currentElement == valueIn) {
                return true;
            }
        }
        return false;
    }

    static int search (int[] arrayIn, int valueIn) {
        for (int i = 0; i < arrayIn.length; i++) {
            if (arrayIn[i] == valueIn) {
                return i;
            }
        }
        return -999;
    }

    static double avgArr (int[] arrayIn) {
        return sum(arrayIn) / arrayIn.length;
    }

    static void greatAvg(int[] arrayIn) {
        double avg = avgArr(arrayIn);
        for (int element : arrayIn) {
            if (element >= avg) {
                System.out.println(element + " is greater than or equal to " + avg);
            }
        }
    }

    static void displayArray(int[] arrayIn) {
        System.out.println();
        for (int i = 0; i < arrayIn.length; i++) {
            System.out.println("array[" + i + "] = " + arrayIn[i]);
        }
    }

    static double[] enterTemps() {
        Scanner keyboard = new Scanner(System.in);
        double[] temperatureOut = new double[7];
        for (int i = 0; i < temperatureOut.length; i++) {
            System.out.println("enter max temperature for day " + (i+1));
            temperatureOut[i] = keyboard.nextDouble();
        }
        keyboard.close();
        return temperatureOut;
    }
    static void displayTemps(double[] temperatureIn) {
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED***");
        System.out.println();
        for (int i = 0; i < temperatureIn.length; i++) {
            System.out.println("day "+(i+1)+" "+ temperatureIn[i]);
        }
    }

    static void wasHot(double[] temps) {
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > 18) {
                System.out.println("The " + i + " day was hot (" + temps[i] + ").");
            }
        }
    }

    public static void main(String[] args) {

        double[] temperature ;
        temperature = enterTemps();
        displayTemps(temperature);
        wasHot(temperature);

        int[] myArr = new int[5];
        fillArray(myArr);
        greatAvg(myArr);

        int[] myArr2 = new int[5];
        fillArray(myArr2);
        if (allHavePassed(myArr2)) {
            increaseMarks(myArr2);
        }
        displayArray(myArr2);

    }

}