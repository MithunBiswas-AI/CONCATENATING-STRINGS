import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the first string from the user
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Get the second string from the user
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Concatenate the strings using the concat method
        String concatenatedString = firstString.concat(secondString);


        System.out.println("Concatenated String: " + concatenatedString);


        boolean isAlternating = isAlternatingStrings(firstString, secondString, concatenatedString);

        // Display the result
        if (isAlternating) {
            System.out.println("The concatenated string is alternating.");
        } else {
            System.out.println("The concatenated string is not alternating.");
        }
    }

    private static boolean isAlternatingStrings(String str1, String str2, String concatenatedStr) {
        int length1 = str1.length();
        int length2 = str2.length();
        int concatenatedLength = concatenatedStr.length();

        // Check if the length of the concatenated string is the sum of the lengths of the two original strings
        if (concatenatedLength != length1 + length2) {
            return false;
        }

        // Check if the characters in the concatenated string alternate between the two original strings
        for (int i = 0; i < concatenatedLength; i++) {
            if (i % 2 == 0 && i / 2 < length1) {
                if (concatenatedStr.charAt(i) != str1.charAt(i / 2)) {
                    return false;
                }
            } else {
                if (concatenatedStr.charAt(i) != str2.charAt(i / 2)) {
                    return false;
                }
            }
        }

        return true;

    }
}