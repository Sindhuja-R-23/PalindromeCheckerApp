public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        long start = System.nanoTime();

        String rev = new StringBuilder(word).reverse().toString();

        boolean result = word.equals(rev);

        long end = System.nanoTime();

        System.out.println(result ? "Palindrome" : "Not Palindrome");
        System.out.println("Execution Time: " + (end-start));
    }
}