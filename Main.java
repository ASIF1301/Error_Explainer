import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ErrorDatabase db = new ErrorDatabase();

        System.out.println("=== Java Error Explainer ===");
        System.out.println("Type 'exit' to quit.\n");

        while (true) {
            System.out.print("Enter Java Error (e.g., NullPointerException): ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye 👋 Keep debugging smartly!");
                break;
            }

            ErrorInfo error = db.searchError(input);
            if (error != null) {
                System.out.println("\n⚡ Error Found: " + error.getErrorName());
                System.out.println("👉 Explanation: " + error.getExplanation());
                System.out.println("🛠 Fix Suggestion: " + error.getFixSuggestion());
            } else {
                System.out.println("❌ Sorry, I don’t recognize this error yet.");
            }

            System.out.println("-----------------------------------\n");
        }

        sc.close();
    }
}