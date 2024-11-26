package com.bullet.format;

/**
 * @author brilliant
 * @author com.bullet
 * @since 25-11-2024
 * */

/* This class will initially for exploring issues related to formatting
*  output on the console or in files.
*
*  It may latter evolve as time progresses. Only time will tell...*/
public class FormatUtilities {
    public static void main(String[] args) {
        /*     %[flags][width][.precision]conversion-character

        *      'd': integers e.g byte, int, short, long
        *      'f': floating point numbers
        *      'c': character values
        *      's': strings
        *      'n': newline
        * */
        String firstName = "Trevor";
        String lastName = "Madedido";
        String gender = "Male";
        int age = 38;
        double pi = Math.PI;
        float gravity = 9.81f;
        System.out.printf("%10s%10s%6s%4d%6.2f%4.1f", firstName, lastName, gender, age,
                pi, gravity);   // Brilliant  Chikanya  Male  38  3.14 9.8
        System.out.println(" ");
        System.out.println("*************************************************************************");
        System.out.printf("%-15s%15s%8s%6d%8.2f%6.1f", firstName, lastName, gender, age,
                pi, gravity);   //           Brilliant       Chikanya    Male    38    3.14   9.8

    }
}
