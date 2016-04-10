/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler;

/**
 *
 * @author x
 */
public class Problem_09_PythagoreanTriplet {

    public static void main(String[] args) throws java.lang.Exception {

        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= 1000; j++) {
                for (int k = 1; k <= 1000; k++) {
                    if (i + j + k == 1000) {
                        if (evenlyDivisible(i, j, k)) {
                            System.out.println(i + " " + j + " " + k);
                            System.out.println(i * j * k);
                        }
                    }
                }
            }
        }
    }

    public static boolean evenlyDivisible(int a, int b, int c) {
        a = a * a;
        b = b * b;
        c = c * c;
        if (a + b == c || a + c == b || b + c == a) {
            return true;
        }
        return false;
    }
}
