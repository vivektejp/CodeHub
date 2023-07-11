import day4.ImplementInterface;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello world");
        Student s = new Student();
        s.setName("vivek");
        System.out.printf("Name of the student: "+ s.getName());

        Product product = new Product();
        product.setPrice(10.5);
        double price = product.getPrice();
        System.out.println("Price for single quantity: " + price);

        int quantity = 5;
        double totalPrice = product.getPrice(quantity);
        System.out.println("Price for " + quantity + " quantities: " + totalPrice);

        //runtime polymorphism
        Department department = new SalesDepartment(10);
        int departmentSize = department.getDepartmentSize();
        System.out.println("Department Size: " + departmentSize);


    }
}