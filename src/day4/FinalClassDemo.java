package day4;

public class FinalClassDemo {
    final int finalVariable = 10;

    final void finalMethod() {
        System.out.println("This is the final method.");
    }
    public static void main(String[] args) {
        FinalClassDemo finalObj = new FinalClassDemo();
        System.out.println("Final variable: " + finalObj.finalVariable);
        finalObj.finalMethod();
    }
}
