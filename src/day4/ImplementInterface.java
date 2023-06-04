package day4;

public class ImplementInterface implements Interface1,Interface2 {
    public void firstMethod() {
        System.out.println("Implementation of method 1");
    }

    @Override
    public void secondMethod() {
        System.out.println("Implementation of method 2");
    }
    public static void main(String[] args) {
        //02-06 assignment
        ImplementInterface intr = new ImplementInterface();
        intr.firstMethod();
        intr.secondMethod();
    }

}
