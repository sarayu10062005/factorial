public class Fact {
    public static void main(String[] args) {
        int n = 4, fact = 1;
        for (int i = n; i > 0; i--) {fact = fact * i;}
        System.out.printf("The factorial of %d is: %d", n, fact);
    }
}
