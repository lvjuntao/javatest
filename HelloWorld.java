public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);
        int difference = minus(5, 3);
        System.out.println("Difference: " + difference);
        int product = multiply(5, 3);
        System.out.println("Product: " + product);        
    }

    public static int add(int a, int b) {
        System.out.println("Starting add function with parameters: " + a + ", " + b);
        int result = a + b;
        System.out.println("Ending add function with result: " + result);
        return result;
    }
    public static int minus(int a, int b) {
        System.out.println("Starting minus function with parameters: " + a + ", " + b);
        int result = a - b;
        System.out.println("Ending minus function with result: " + result);
        return result;
    }

    public static int multiply(int a, int b) {
        System.out.println("Starting multiply function with parameters: " + a + ", " + b);
        int result = a * b;
        System.out.println("Ending multiply function with result: " + result);
        return result;
    }
}