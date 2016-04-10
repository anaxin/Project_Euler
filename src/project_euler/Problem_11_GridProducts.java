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
public class Problem_11_GridProducts {

    public static void main(String[] args) throws java.lang.Exception {
        int[][] grid = new int[20][20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                grid[i][j] = sc.nextInt();
            }
        }//c/p grid as input
        long max = 1;
//        for (int i = 0; i < 20; i++) {//left to right check
//            long product = 1;
//            for (int j = 0; j < 17; j++) {
//                product = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
//                System.out.println("product " + grid[i][j] + "  " + grid[i][j + 1] + "  " + grid[i][j + 2] + "  " + grid[i][j + 3]+ "  " + product);
//            }
//
//            max = Math.max(max, product);
//            System.out.println("max  " + max);
//        }
//        for (int i = 0; i < 20; i++) {//up down 
//            long product = 1;
//            for (int j = 0; j < 17; j++) {
//                product = grid[j][i] * grid[j + 1][i] * grid[j + 2][i] * grid[j + 3][i];
//                System.out.println("product " + grid[j][i] + "  " + grid[j + 1][i] + "  " + grid[j + 2][i] + "  " + grid[j + 3][i]+ "  " + product);
//            }
//            max = Math.max(max, product);
//            System.out.println("max  " + max);
//        }//http://stackoverflow.com/questions/21346343/traverse-an-array-diagonally
        for (int k = 0; k <= 2 * (grid.length - 1); ++k) {
            int yMin = Math.max(0, k - grid.length + 1);
            int yMax = Math.min(grid.length - 1, k);
            List<Integer> list = new ArrayList<>();
            for (int y = yMin; y <= yMax; ++y) {
                int x = k - y;
                list.add(grid[y][x]);
                //System.out.print(grid[y][x]);
            }
            max = checkProductMax(list, max);
            System.out.println("max  " + max);
        }
        for (int j = 0; j < grid.length; j++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < grid.length; i++) {

                if (i + j >= grid.length) {
                    break;
                }
                list.add(grid[i][i + j]);
                //System.out.print(grid[i][i + j]);
            }
            max = checkProductMax(list, max);
            System.out.println("max  " + max);
        }
        for (int j = 1; j < grid.length; j++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < grid.length; i++) {
                if (i + j >= grid.length) {
                    break;
                }
                list.add(grid[i + j][i]);
                //System.out.print(grid[i + j][i]);
            }
            max = checkProductMax(list, max);
            System.out.println("max  " + max);
        }
        System.out.println("max last " + max);
    }

    public static long checkProductMax(List<Integer> list, long max) {
        if (list.size() < 4) {
            return max;
        } else {
            int prod = 1;
            for (int i = 0; i < list.size() - 3; i++) {
                prod = list.get(i) * list.get(i + 1) * list.get(i + 2) * list.get(i + 3);
                System.out.println("product " + prod);
                max = Math.max(max, prod);
            }
            
        }
        return max;
    }

}//70600674
