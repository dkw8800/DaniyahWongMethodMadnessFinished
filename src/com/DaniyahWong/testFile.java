package com.DaniyahWong;

public class testFile {

    public static void main(String[] args) {
        System.out.println("The word racecar is a palindrome? " + DWongLib.isPalindrome("racecar"));
        //This checks the isPalindrome method, and it should return true
        System.out.println("Today is 08/07/2018. " + DWongLib.datestr("08/07/2018"));
        //This checks the dateStr method, and it should return 07-08-2018
        System.out.println("The first cat cut out of catastrophic cat makes " + DWongLib.cutOut("catastrophic cat","cat"));
        //This checks the cutout method, and it should return astrophic cat
        System.out.println("The numbers counting to 5 add up to " + DWongLib.sumUpTo(5));
        //This checks the sumupto method, and it should return 15
        System.out.println("The multiplication table for 5 until 10 is ");
        DWongLib.multiplicationTable(5,10);
        //This checks the multiplicationTable method, and it should return the numbers from 0 to 50
    }
}
