/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author x
 */
public class Problem_12_TriangularNumbersDivisible {

    public static void main(String[] args) throws java.lang.Exception {
        long i = 1;
        long triangular = 0;
        int counter;
        //list.add(i);
        do {
            counter = 2;
            triangular += i;
            i++;
            System.out.println(triangular);
            for (int j = 2; j <= Math.sqrt(triangular); j++) {
                if (triangular % j == 0) {
                    counter += 2;
                    if (counter >= 500) {
                        System.out.println(triangular);
                    }
                }
            }
        } while (counter <= 500);
       // 76576500

    }

}

