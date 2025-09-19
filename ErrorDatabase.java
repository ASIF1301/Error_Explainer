import java.util.*;

public class ErrorDatabase {
    private Map<String, ErrorInfo> errorMap;

    public ErrorDatabase() {
        errorMap = new HashMap<>();
        loadErrors();
    }

    private void loadErrors() {
        errorMap.put("NullPointerException",
            new ErrorInfo("NullPointerException",
                "You are trying to use an object that has not been initialized (null).",
                "Check if the object is null before using it, or initialize it properly."));

        errorMap.put("ArrayIndexOutOfBoundsException",
            new ErrorInfo("ArrayIndexOutOfBoundsException",
                "You are trying to access an array element at an invalid index.",
                "Ensure your index is within the array bounds (0 to length-1)."));

        errorMap.put("ClassNotFoundException",
            new ErrorInfo("ClassNotFoundException",
                "The JVM cannot find the specified class at runtime.",
                "Check your classpath and ensure the required .class file or library is included."));

        errorMap.put("NumberFormatException",
            new ErrorInfo("NumberFormatException",
                "You tried to convert a string into a number, but the string isn’t numeric.",
                "Validate the string before parsing or use try-catch to handle invalid input."));

        errorMap.put("StackOverflowError",
            new ErrorInfo("StackOverflowError",
                "Your program has too much recursion without a base case.",
                "Fix recursive functions by adding proper termination conditions."));
    }

    // Case-insensitive + partial match search
    public ErrorInfo searchError(String input) {
        String lowerInput = input.toLowerCase();

        // First try exact case-insensitive match
        for (String key : errorMap.keySet()) {
            if (key.equalsIgnoreCase(input)) {
                return errorMap.get(key);
            }
        }

        // If no exact match, try partial contains match
        for (String key : errorMap.keySet()) {
            if (key.toLowerCase().contains(lowerInput)) {
                return errorMap.get(key);
            }
        }

        return null; // not found
    }
}


