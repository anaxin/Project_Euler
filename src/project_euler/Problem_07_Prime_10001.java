package project_euler;


import java.math.BigDecimal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author x
 */
public class Problem_07_Prime_10001 {

    public static void main(String[] args) {
        
    
        BigDecimal next = new BigDecimal("1");
        for (int i = 1; i <= 10001; i++) {
            next = nextPrime(next);
            System.out.println(next);
        }
 
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
