/*
* This class calculates the circumference of a circle.
* The radius is set by the user.
 */
package ua.jvlab.smlnk;

import java.util.Scanner;

/**
 * @author: Sergey Melnyk
 * @date: 24.12.2017
 */
public class LengthCircle {

    /**
     * @param args: c - circumference of a circle, r - radius circle.
     */
    double c;
    double r;

    public static void main(String[] args) {

        /**
         * To enter the data of the sides of the triangle, use the class Scanner
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите радиус круга в см: ");
        double r = sc.nextDouble();
        double c = 2 * Math.PI * r;
        System.out.println("Длина окружности = " + c + " см");
    }

}
