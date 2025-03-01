public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);
    }

    public static int add(int a, int b) {
        System.out.println("Starting add function with parameters: " + a + ", " + b);
        int result = a + b;
        System.out.println("Ending add function with result: " + result);
        return result;
    }
}