package day4;

public class DemoStaticClass {

    private static int staticVariable;

    public static int staticMethod() {
        // Perform some computation to get the value for the static variable
        return 12*120;
    }

    static {
        staticVariable = staticMethod();
    }

    public static int getStaticVariable() {
        return staticVariable;
    }
    public static void main(String[] args) {
        int value = DemoStaticClass.getStaticVariable();
        System.out.println("Static variable value is: " + value);
    }
}

