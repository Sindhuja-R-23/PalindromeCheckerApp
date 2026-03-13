interface PalindromeStrategy {
    boolean check(String str);
}

class ReverseStrategy implements PalindromeStrategy {

    public boolean check(String str) {

        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeStrategy strategy = new ReverseStrategy();

        System.out.println(strategy.check("level"));
    }
}