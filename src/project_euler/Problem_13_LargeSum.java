/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author x
 */
public class Problem_13_LargeSum {

    public static void main(String[] args) throws java.lang.Exception {
        String[] grid = new String[100];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
                grid[i] = sc.nextLine();  
        }
        List<Integer> list = new ArrayList<>();
        //traverse from top right 
        int carry = 0;
        for (int j = 49; j >= 0; j--) {
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                int temp =(grid[i].charAt(j)-'0');
               // System.out.println("j "+j+" i " +i);
              //  System.out.println(temp);
                sum += temp;
            }
            
            sum += carry;
            int lastDigit = sum % 10;
            list.add(lastDigit);
            carry = sum / 10;
            System.out.println("sum "+ sum + " carry " +carry +" last digit "+ lastDigit );
        }
        System.out.println("last carry  " + carry);
        System.out.println("final list  " + list);
        
    }// 5537376230
}
