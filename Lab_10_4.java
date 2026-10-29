import java.util.Arrays;
import java.util.Scanner;

public class Lab_10_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String str1 = sc.nextLine();

        System.out.print("Enter String 2: ");
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
str2 = str2.toLowerCase();

        // Check length
        if(str1.length() != str2.length()) {
            System.out.println("Strings are NOT Simqual");
            return;
        }

        // Convert strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare both arrays
        if(Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are Simqual");
        }
        else {
            System.out.println("Strings are NOT Simqual");
        }
    }
}