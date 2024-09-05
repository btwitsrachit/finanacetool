import java.util.Scanner;

class StaticMethodExample {
    static int a, b;

    public void getData() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the 2 numbers.");
        a = obj.nextInt();
        b = obj.nextInt();
    }

    public static int nonPrime() {
        int sum = 0;
        for (int n = a; n <= b; n++) {
            if (n <= 1) { // 0 and 1 are not considered prime numbers
                System.out.println(n);
                sum += n;
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime) {
                System.out.println(n);
                sum += n;
            }
        }
        return sum; // Return the sum of non-prime numbers
    }

    public static void printSum(int s) {
        System.out.println("Non-prime sum: " + s);
    }

    public static void main(String[] args) {
        StaticMethodExample obj = new StaticMethodExample();
        obj.getData();
        int sum = nonPrime();
        printSum(sum);
    }
}
