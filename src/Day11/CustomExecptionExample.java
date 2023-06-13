package Day11;

public class CustomExecptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            try {
                throwCustomException(e);
            } catch (CustomException ex) {
                System.out.println("Caught CustomException: " + ex.getMessage());
            }
        }
    }

    public static void throwCustomException(ArithmeticException e) throws CustomException {
        throw new CustomException("CustomException occurred: " + e.getMessage());
    }
}
