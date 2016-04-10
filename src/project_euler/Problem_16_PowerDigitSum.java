/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler;

import java.math.BigInteger;

/**
 *
 * @author x
 */
public class Problem_16_PowerDigitSum {

    public static void main(String[] args) {
//        int second = 1;
//        int third = 1;
        BigInteger result = new BigInteger("2").pow(1000);

        BigInteger last;
        BigInteger ten = new BigInteger("10");
        int sum = 0;
        while (result.compareTo(BigInteger.ZERO) == 1) {
            last = result.mod(ten);
            sum += Integer.valueOf(last.toString());
            result = result.divide(ten);
        }
        System.out.println(sum);
    }//1366
}
