package day5;

import java.util.Scanner;

public class fibonacci {

    public void printSequence(int num){
        int x=0,y=1,res=0;
        System.out.print(x+" "+y+" ");
        for(int i=2;i<num;i++){
            res=y+x;
            x=y;
            y=res;
            System.out.print(res+" ");
        }
    }
    public static void main(String[] args){
        fibonacci ag = new fibonacci();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int num = Integer.parseInt(str);
        ag.printSequence(num);
    }
}
