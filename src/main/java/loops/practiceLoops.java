package loops;

public class practiceLoops {
    public static void main(String[] args) {

        for (int t = 10; t >= 1; t--) {
            System.out.println("The value of x is: " + t);
        }

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        for (int y = 10; y >= 0; y = y - 2) {
            System.out.println("The value of y is:" + y);

        }

        for (int j = 1; j <= 15; j += 2) {
            System.out.println(" The value is number is:" + j);

        }

        int sum = 0;
        for (int u = 1; u <= 10; u++) {
            System.out.println("The value of num is: " + u);
            sum = sum + u;

        }
        System.out.println("The result is " + sum);


        // ============================================================================
        int summer = 0;
        for (int n = 0; n <= 100; n += 2) {
            System.out.println("The value of num is " + n);
            summer = summer + n;

        }
    }
}
