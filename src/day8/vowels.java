package day8;

import java.util.Scanner;

public class vowels {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int vowels=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ||
                    str.charAt(i)=='A' ||str.charAt(i)=='E' ||str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U' )
                vowels++;

        }

        System.out.print("number of vowels in the string are:"+vowels);
    }
}
