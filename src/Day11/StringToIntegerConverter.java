package Day11;

public class StringToIntegerConverter {

    public static int convertToInteger(String str) throws NumberFormatException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Cannot convert '" + str + "' to an integer");
        }
    }
    public static void main(String[] args) {
        String[] inputs = {"23", "45.67", "test", "123f"};

        // Convert and print the return value or exception
        for (String input : inputs) {
            try {
                int result = convertToInteger(input);
                System.out.println("Input: " + input + ", Converted: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Input: " + input + ", Exception: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }


}
