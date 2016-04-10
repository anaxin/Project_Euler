package project_euler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x
 */
public class Problem_05_EvenlyDivisible {
     public static void main(String[] args) throws java.lang.Exception {
         int i = 21;
         while(!EvenlyDivisible(i)){
            i++;    
         }
         System.out.println(i);
    }
     public static boolean EvenlyDivisible(int n){
         for (int i=1;i<=20;i++){
             if(n%i != 0){
                 return false;
             }
         }
         return true;
     }
}
