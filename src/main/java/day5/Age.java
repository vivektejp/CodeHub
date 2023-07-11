package day5;

import java.util.Scanner;

public class Age {

    public void printAge(int age){

        if(age>=13&&age<=19)
            System.out.println("teen");
        else if (age<13)
            System.out.println("kid");
        else
            System.out.println("Adult");
    }
    public static void main(String[] args){
        Age ag = new Age();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int num = Integer.parseInt(str);
        ag.printAge(num);
    }
}
