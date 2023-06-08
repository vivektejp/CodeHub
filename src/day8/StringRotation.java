package day8;

import java.util.Scanner;

public class StringRotation {

    public int checkStrings(String str1,String str2){

        String intr=str1+str1;
        if(intr.contains(str2))
            return 1;
        else
            return 0;
    }
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter string 1");
        String str1 = scan.nextLine();
        System.out.println("enter string 2");
        String str2 = scan.nextLine();
        StringRotation sr= new StringRotation();
        int res=sr.checkStrings(str1,str2);
        if(res==0)
            System.out.println("false");
        else
            System.out.println("true");
    }
}
