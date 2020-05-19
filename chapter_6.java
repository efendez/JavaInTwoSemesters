/**
 * ---------- Arrays
 * 
 * An array is a collection of items that holds information of a desired type. You can not "mix" data types, an integer array may only hold integer values, a char array may only hold character values, and so on and so forth.
 * 
 * Any declared array must allocate a certain ammount of space in memory. This translates to specifying the maximum number of elements an array should contain.
 * 
 * To use an array we need two things, a declaration and memory allocation.
 * 
 *      1.- type[] arrayName;
 *      2.- arrayName = new type[length];
 * 
 * These two elements can be combined into a single line expression:
 * 
 *      3.- type[] arrayName = new type[length];
 * 
 * Array elements can be accessed through indexing. Java arrays start at index 0.
 * 
 * If the elements of an array are known beforehand, then we can create an array with these initial values. The array length is infered by how many elments are specified in the sigle line expression. They are placed in braces and separated by commas:
 * 
 *      type[] arrayName = {1-element, 2-element, ..., nth-element}
 *      arrayName has n elements and its last index is n - 1
 * 
 * To asign and retrieve information of an array we must access those elements exclusively through indexing.
 * 
 *      System.out.println(arrayName[0]);
 *      [Out] 1-element
 * 
 *      arrayName[2] = 3-element
 * 
 * We can access array items dynamicly using a loop.
 * 
 * We can use send arrays as parameters, but there's a catch. We've seen that when we sent a value as a parameter, we were actually sending a copy of that variable, as for arrays it works a little different. When sending an array as a parameter we are not sending a copy of such, we are sending a pointer to the arrays allocated memory.
 * 
 * Varargs is a way of writing functions / methods that can "accept" arrays or any variable of the same type as the same parameter. The varargs argument must come last in the parameter list.
 * 
 *      static type funcName(type... variableName)
 * 
 * We can also create methods that return an array value.
 *  
 * For each loops are used to access the entirety of an array and if we wish to read the elements in the array, but not modify them. While using for each loops we do not need array indexes to access elements of a desired array.
 * 
 * Multi-dimensional arrays / Two dimensional arrays
 * 
 *      type[][] arrayName = new type[length][lengt]
 * 
 *      type[][] arrayName = {
 *                              {(row-0 col-0), (row-0 col-1), (...)},
 *                              {(row-1 col-0), (row-1 col-1), (...)},
 *                              ...
 *                           }
 * 
 * We will often need multi-dimensional arrays of different inner lengths. These type of arrays are called ragged arrays since they are "partitioned" as how their inner lengths behave.  
 * 
 */

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

        /*double[] temperature ;
        temperature = enterTemps();
        displayTemps(temperature);
        wasHot(temperature);*/

        /*int[] myArr = new int[5];
        fillArray(myArr);
        greatAvg(myArr);*/

        /*int[] myArr = new int[5];
        fillArray(myArr);
        if (allHavePassed(myArr)) {
            increaseM   arks(myArr);
        }
        displayArray(myArr);*/

    }

}