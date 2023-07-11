package day8;

import java.util.Scanner;

public class anagrams {

    public int checkAnagrams(String s1,String s2){

        int res=1;
        if(s1.length()!=s2.length())
            return 0;
        int[] c1 =new int[26];
        int[] c2= new int[26];
        for(int i=0;i<s1.length();i++)
            c1[s1.charAt(i)-'a']++;
        for(int i=0;i<s2.length();i++)
            c2[s2.charAt(i)-'a']++;
        for(int i=0;i<s1.length();i++){
            if(c1[i]!=c2[i])
                res=0;
        }
        return res;
    }
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first string");
        String str1 = scan.nextLine();
        String s1= str1.toLowerCase();
        System.out.println("enter second string");
        String str2 = scan.nextLine();
        String s2=str2.toLowerCase();
        anagrams an = new anagrams();
        int res= an.checkAnagrams(s1,s2);
        if(res==0)
            System.out.println("not anagrams");
        else
            System.out.println("anagrams");
    }
}
