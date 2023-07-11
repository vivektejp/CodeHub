package day8;
import java.util.Scanner;

public class ReverseSentence {

    public String reverse(String[] str){

        String res= "";
        for(int i=0;i< str.length;i++){
            String s1= str[i];
          //  System.out.println("str[i]: "+str[i]);
            String s2="";
           // int count=0;
            for(int j=s1.length()-1;j>=0;j--) {
                s2 = s2 + s1.charAt(j);
                //System.out.println("s2: "+s2);
            }
            res=res+s2+" ";
        }
        return res;
    }
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String sen = scan.nextLine();
        String[] str= sen.split(" ");
        ReverseSentence rs= new ReverseSentence();
        String res= rs.reverse(str);
        System.out.println("reversed sentence: "+res);
    }
}
