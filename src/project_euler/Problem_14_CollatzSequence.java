/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author x
 */
public class Problem_14_CollatzSequence {
static HashMap<Long, Integer> map = new HashMap<>(); //index, count

    public static void main(String[] args) throws java.lang.Exception {
        int max = 0;
        long index = 0;

       // System.out.println(collatz(13));
        for (long i = 2; i < 1000000; i++) {
            System.out.println(i);
            int count = collatz(i);
            if (count > max) {
                max = count;
                index = i;
            }
            map.put(i,count);
        }
        System.out.println(index);
    }//837799

    public static int collatz(long n) {
        int count = 1;
        while (n != 1) {
            if (map.containsKey(n)){
                count += map.get(n);
                return count;
            }
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
           count++;
        }
        return count;
    }
}