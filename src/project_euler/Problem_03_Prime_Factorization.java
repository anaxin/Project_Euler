/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author x
 */
public class Problem_03_Prime_Factorization {

    public static void main(String[] args) {
        BigDecimal n = new BigDecimal("600851475143");
        BigDecimal next = new BigDecimal("1");
        BigDecimal twoo = new BigDecimal("2");
        
      System.out.println("last prime " + primeFactorization(n, twoo));
    
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

    public static BigDecimal primeFactorization(BigDecimal n, BigDecimal prime) {
     
        if (((n.divide(prime, 6, RoundingMode.HALF_DOWN)).remainder(BigDecimal.ONE)).compareTo((BigDecimal.ZERO)) == 0) {
            n = n.divide(prime, 6, RoundingMode.HALF_DOWN);
         
            System.out.println("prime " + prime);
            if (isPrime(n)) {
                return n;
            } else {
                return primeFactorization(n, prime);
            }
        } else {
            return primeFactorization(n, nextPrime(prime));
        }
    }

    private static boolean isPrime(BigDecimal num) {
        BigDecimal two = new BigDecimal("2");
        if (num.equals(two)) {
            return true;
        }
        if (num.remainder(two).equals(BigDecimal.ZERO)) {
            return false;
        }
BigDecimal i = new BigDecimal("3");
        while ((i.multiply(i)).compareTo(num) == -1 || (i.multiply(i)).compareTo(num) == 0) {
             
            if (num.remainder(i).compareTo(BigDecimal.ZERO)==0) {
                return false;
            }
            i = (i.add(two));
        }
        return true;
    }
}
