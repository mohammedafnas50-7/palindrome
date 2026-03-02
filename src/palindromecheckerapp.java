public class palindromecheckerapp {

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        // Normalize the string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = normalized.length() - 1;

        // Check palindrome using two-pointer technique
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String text = "Never Odd Or Even";

        if (isPalindrome(text)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}