package day4;

public class Child extends Parent {
    public int childVariable;

    public Child(int parentVariable, int childVariable) {
        super(parentVariable);
        this.childVariable = childVariable;
    }

    public Child(int childVariable) {
        super(0); // Call parent class constructor with default value for parentVariable
        this.childVariable = childVariable;
    }

    public int getChildVariable() {
        return childVariable;
    }
        public static void main(String[] args) {
            Child childObj1 = new Child(100, 200);
            System.out.println("Child variable: " + childObj1.getChildVariable());

            Child childObj2 = new Child(300);
            System.out.println("Child variable: " + childObj2.getChildVariable());
        }
    }
