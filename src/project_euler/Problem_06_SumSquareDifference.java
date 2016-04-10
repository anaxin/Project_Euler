/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler;

/**
 *
 * @author x
 */
public class Problem_06_SumSquareDifference {
     public static void main(String[] args) throws java.lang.Exception {
         System.out.println(sumAndSquare(100)-sumOfSquares(100));

    }
     public static int sumOfSquares(int n){
         int sum=0;
         for (int i=1;i<=n;i++){
             sum+=i*i;
         }
         return sum;
     }
     public static int sumAndSquare(int n){
         int sum=0;
         for (int i=1;i<=n;i++){
             sum+=i;
         }
         return sum*sum;
     }
}
