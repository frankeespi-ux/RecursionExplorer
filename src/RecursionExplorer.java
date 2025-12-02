import java.util.Scanner;

public class RecursionExplorer {

    private final Scanner scanner;

    public RecursionExplorer() {
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        RecursionExplorer app = new RecursionExplorer();
        app.run();
    }

    public void run() {
        boolean running = true;

        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1" -> handleFactorial();
                case "2" -> handleSumToN();
                case "3" -> handleReverseString();
                case "4" -> handleReverseTrace();
                case "0" -> {
                    System.out.println("Goodbye.");
                    running = false;
                }
            
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void printMenu() {
        System.out.println();
        System.out.println("=== Recursion Explorer ===");
        System.out.println("1. Factorial (n!)");
        System.out.println("2. Sum from 1 to n");
        System.out.println("3. Reverse a string");
        System.out.println("4. Reverse a string with trace");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }

    // TODO: We will implement these together
    private long factorial(int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }

    private int sum(int n) {
        // Base case
        if (n == 1) {
            return 1; // Base case
        }
        return n + sum(n - 1); // Recursive case
    }

    private String reverseString(String s) {
        // Base case
        if (s.length() <= 1) {
            return s;
        }
        // Recursive case
        // last character + everything before it
        return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
    }

    private String reverseStringTrace(String s, int depth) {
        // indentation for visualizing recursion depth
        String indent = " ".repeat(depth);
        
        System.out.println(indent + "reverseString(\"" + s + "\"");
        
        // Base case
        if (s.length() <= 1) {
            System.out.println(indent + "Base Case: returning \"" + s + "\"");
            return s;
        }

        // Recursive case
        char last = s.charAt(s.length() - 1);
        String remaining = s.substring(0, s.length() - 1);
        
        String result = last + reverseStringTrace(remaining, depth + 1);

        System.out.println(indent + "Returning: \"" + result + "\"");
        return result;
    }

    private void handleFactorial() {
        System.out.print("Enter a non-negative integer n: ");
        String input = scanner.nextLine().trim();
        int n;

        try {
            n = Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            System.out.println("That wasn't a valid integer.");
            return;
        }

        if (n < 0) {
            System.out.println("n must be non-negative.");
            return;
        }

        // TODO: Call a recursive factorial method here
        long result = factorial(n);
        System.out.println("factorial(" + n + ") = " + result);
    }

    private void handleSumToN() {
        System.out.println("Enter a positive integer n: ");
        String input = scanner.nextLine().trim();
        int n;

        try {
            n = Integer.parseInt(input);
            if (n < 1) {
                System.out.println("Please enter a number greater than 0.");
                return;
            }
        } catch (NumberFormatException ex) {
            System.out.println("That wasn't a valid integer.");
            return;
        }

        int result = sum(n);
        System.out.println("Sum from 1 to " + n + " is: " + result);
    }

    private void handleReverseString() {
        System.out.println("Enter a string to reverse: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("Reversed: " + reversed);
    }
    private void handleReverseTrace() {
        System.out.print("Enter a string to reverse with trace: ");
        String input = scanner.nextLine();

        System.out.println("\n--- Recursion Trace ---");
        String result = reverseStringTrace(input, 0);
        System.out.println("\nFinal result: " + result);
    }

}
