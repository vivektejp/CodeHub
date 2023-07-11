package day5;

import java.util.Scanner;

public class sample {
    public int numReverse(int num) {
        int res = 0,i=0,tmp=num;

        while(tmp!=0){

            res=res*10;
            res=res+tmp%10;
            tmp=tmp/10;
        }
        return res;


    }

    public static void main(String[] args){
        sample sm = new sample();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int num = Integer.parseInt(str);
        int res = sm.numReverse(num);

        System.out.println("reverse of a number is"+sm.numReverse(num));
    }
}