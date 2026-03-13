class PalindromeService {

    boolean checkPalindrome(String word) {

        String reverse = new StringBuilder(word).reverse().toString();
        return word.equals(reverse);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeService service = new PalindromeService();

        System.out.println(service.checkPalindrome("madam"));
    }
}