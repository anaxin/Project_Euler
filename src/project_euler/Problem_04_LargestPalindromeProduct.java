/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author x
 */
public class Problem_04_LargestPalindromeProduct {

    public static void main(String[] args) throws java.lang.Exception {
        List<Integer> list = new ArrayList<>();
        //should just keep holding max value and compare to new one
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                if (isPalindrome(i * j)) {
                    list.add(i*j);
                }
            }
        }
        Collections.sort(list);
        System.out.println(Arrays.asList(list));
    }

    public static boolean isPalindrome(int n) {
        String str = String.valueOf(n);
        int length = str.length();
        int right = length - 1;
        boolean isPalindrome = true;
        for (int left = 0; left <= length / 2; left++) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            right--;
        }
        return isPalindrome;
    }
}
