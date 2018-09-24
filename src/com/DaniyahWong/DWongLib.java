package com.DaniyahWong;

public class DWongLib {

    public static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.substring(i, i + 1);
        }
        if (reverse.compareTo(str) == 0) {
            return true;
        } else {
            return false;
        }
        //This method checks for whether the word in the paramater is a palindrome by creating a new string,
        // building onto it from the end to the start of the original, and comparing them to each other.
    }

    public static String datestr(String str)
    {
        return str.substring(3,5) + "-" + str.substring(0,2) + "-" + str.substring(6);
        //This method replaces the / in a date entered like mm/dd/yyyy as dd-mm-yyyy instead by
        //cutting out parts of the original string with the numbers and adding them together with -.
    }

    public static String cutOut(String main, String cut)
    {
        String results = "";
        int cutoff = main.indexOf(cut);
        results = results + main.substring(0,cutoff) + main.substring(cutoff + cut.length());
        return results;
        //This method cuts out the first instance of the specified word to cut from the original string
        // by finding the index the cutoff word starts at and returning the original string only up to and after the word.
    }

    public static void multiplicationTable(int base, int range)
    {
        for(int i = 0; i <= range;i++)
        {
            System.out.println(base*i);
        }
        //This method creates a multiplication table for the specified base number and up to the specified number.
        //This is done by setting up a loop that prints out the next number in the sequence until the range is reached.
    }

    public static int sumUpTo(int total)
    {
        int finalsum = 0;
        for(int i = 0; i <= total;i++)
        {
            finalsum += i;
        }
        return finalsum;
        //This method sums up the numbers that lead up to the total input by using a loop to add up
        //all of the numbers that the loop uses to get to the total.
    }

}
