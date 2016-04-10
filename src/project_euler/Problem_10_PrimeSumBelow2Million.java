/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler;

import java.math.BigDecimal;

/**
 *
 * @author x
 */
public class Problem_10_PrimeSumBelow2Million {

    public static void main(String[] args) {
        BigDecimal sum = new BigDecimal("0");
        BigDecimal next = new BigDecimal("1");
        int i = 1;
        BigDecimal mm = new BigDecimal("2000000");
        while (next.compareTo(mm) == -1) {
            next = nextPrime(next);
            if (next.compareTo(mm) != -1){
                break;
            }
            sum = sum.add(next);
            i++;
            System.out.println("i "+i+" next " + next);
        }
        
        System.out.println(sum);
    }

    public static BigDecimal nextPrime(BigDecimal prime) {
        int p = prime.intValue();
        p += 1;
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {//not a prime
                return nextPrime(BigDecimal.valueOf(p));
            }
        }
        return BigDecimal.valueOf(p);
    }
}
