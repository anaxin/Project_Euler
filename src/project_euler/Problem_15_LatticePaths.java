/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler;

import java.math.BigInteger;
import java.util.Arrays;

/**
 *
 * @author x
 */
public class Problem_15_LatticePaths {

    static int count = 0;

    public static void main(String[] args) throws java.lang.Exception {//137846528820
//        int at[] = new int[2];
//        at[0]=0;
//        at[1]=0;
//        move(at);
        //   n!/ r! (n-r)!   40 moves to any solution. 20 right moves to any solution
        int n = 40;
        int r = 20;
        System.out.println(factorial(n).divide(factorial(r).multiply(factorial(n - r))));
    }

    public static BigInteger factorial(int n) {
        BigInteger temp = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            temp = temp.multiply(BigInteger.valueOf(i));
        }
        return temp;
    }

    public static int[] move(int[] at) {
        if (at[0] == 2 && at[1] == 2) {
            count++;
            System.out.println(count);
        }
        if (at[0] < 2) {
            at[0] += 1;
            move(at);
            at[0] -= 1;
        }
        if (at[1] < 2) {
            at[1] += 1;
            move(at);
            at[1] -= 1;
        }
        return null;
    }
}
