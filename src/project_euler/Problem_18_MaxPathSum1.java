/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author x
 */
public class Problem_18_MaxPathSum1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> list = new ArrayList<>(15);
        for (int i = 0; i < 15; i++) {
            list.add(new ArrayList<>());
            String[] arr = sc.nextLine().split(" ");
            for (String s : arr) {
                list.get(i).add(Integer.valueOf(s));
            }
        }
        System.out.println(Arrays.asList(list));
    }

}
