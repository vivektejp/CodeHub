public class SalesDepartment extends Department {
    private int departmentSize;

    public SalesDepartment(int departmentSize) {
        this.departmentSize = departmentSize;
    }

    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }
}