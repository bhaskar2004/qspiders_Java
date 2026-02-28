package loops;

public class ProductAssignmentProb {

    public static int sumOfAdjacentProducts(int n) {
        int sum = 0;

        int prevDigit = n % 10;  // last digit
        n /= 10;

        while (n != 0) {
            int currentDigit = n % 10;
            sum += currentDigit * prevDigit;

            prevDigit = currentDigit;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 4567;
        System.out.println("Result: " + sumOfAdjacentProducts(n));
    }
}