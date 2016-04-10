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
public class Problem_17_NumberLetterCounts {

    public static void main(String[] args) throws java.lang.Exception {
        int length;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            //length = getLength(i);
            if (i <= 20 && i >= 0) {
                System.out.println(toWords(i));
                sum+= toWords(i).length();
            } else if (i < 100) {
                System.out.print(decada(i / 10));
                System.out.println(toWords(i % 10));
                sum+= decada(i/10).length() + toWords(i%10).length();
            } else if (i < 1000) {
                System.out.print(toWords(i / 100) + "hundred");
                sum+= toWords(i/100).length() + "hundred".length();
                if (i % 100 != 0) {
                    System.out.print("and");
                    sum+= 3;
                }
                if (i % 100 <= 20) {
                    String temp = toWords(i % 100);
                    System.out.println(temp);
                    sum+= temp.length();
                } else {
                    String temp = decada((i % 100 - i % 10) / 10);
                    String temp2 = toWords(i % 10);
                    sum+= temp.length()+temp2.length();
                    System.out.println(temp + temp2);
                }

                //System.out.print(" hundred and  " + decada(i / 10));
                //  System.out.println("  " + toWords(i % 10));
            }
        }
        sum += "onethousand".length();
        System.out.println("final sum " + sum);
    }//21124

    public static int getLength(int n) {
        return String.valueOf(n).length();
    }

    public static String decada(int n) {
        switch (n) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                break;
        }
        return "";
    }

    public static String toWords(int n) {
        switch (n) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            case 20:
                return "twenty";
            default:
                break;
        }
        return "";
    }
}
