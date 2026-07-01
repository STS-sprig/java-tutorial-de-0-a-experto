public class DesafioStringComparacionDos {
    // Create a method that checks if passwords match exactly
    // Should return a String in format: "Password match (exact): true/false"
    public static String checkExactMatch(String stored, String attempt) {
        // Your code here
        // Use the equals() method to compare strings
        boolean eq = stored.equals(attempt);

        return "Password match (exact): " + eq;
    }

    // Create a method that checks if passwords match when ignoring case
    // Should return a String in format: "Password match (ignore case): true/false"
    public static String checkIgnoreCase(String stored, String attempt) {
        // Your code here
        // Use the equalsIgnoreCase() method
        boolean eq = stored.equalsIgnoreCase(attempt);
        return "Password match (ignore case): " + eq;
    }

    // Create a method that compares passwords alphabetically
    // Should return a String in format: "Password comparison: Before/After/Exact match"
    public static String comparePasswords(String stored, String attempt) {
        // Your code here
        // Use the compareTo() method
        // If compareTo returns:
        //   negative -> "Before"
        //   positive -> "After"
        //   zero -> "Exact match"
        int cmp = stored.compareTo(attempt);
        String result=" ";
        if (cmp < 0){
            result = "After";
        } else if(cmp > 0){
            result = "Before";
        }else {
            result = "Exact match";
        }
        return "Password comparison: "+result;
    }

    public static void main(String[] args) {
        // Initialize passwords - don't modify these!
        String storedPassword = "SecurePass123";
        String userAttempt1 = "securepass123";
        String userAttempt2 = "SecurePass123";
        String userAttempt3 = "SecurePass12";
        String[] commonPasswords = {"password123", "12345678", "qwerty123"};

        // Create your validation methods
        String exactCheck = checkExactMatch(storedPassword, userAttempt1);
        String caseCheck = checkIgnoreCase(storedPassword, userAttempt1);
        String comparison = comparePasswords(storedPassword, userAttempt3);

        // Don't modify the code below
        System.out.println("Password Validation Results:");
        System.out.println("---------------------------");
        System.out.println(exactCheck);
        System.out.println(caseCheck);
        System.out.println(comparison);
    }
}
