import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        int n = 5; // Порядок матриці
        int min = 2; // Мінімальне значення простого числа
        int max = 20; // Максимальне значення простого числа

        int[][] matrix = generatePrimeMatrix(n, min, max);

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static int[][] generatePrimeMatrix(int n, int min, int max) {
        int[][] matrix = new int[n][n];
        int[] primes = getPrimes(min, max);
        int count = 0;

        for (int i = 0; i < n; i++) {
            Arrays.fill(matrix[i], primes[count]);
            count++;
        }

        return matrix;
    }

    public static int[] getPrimes(int min, int max) {
        int[] primes = new int[max - min + 1];
        int count = 0;

        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                primes[count] = i;
                count++;
            }
        }

        return Arrays.copyOf(primes, count);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
