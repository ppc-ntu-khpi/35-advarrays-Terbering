import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testGeneratePrimeMatrix() {
        int n = 5; // Порядок матриці
        int min = 2; // Мінімальне значення простого числа
        int max = 20; // Максимальне значення простого числа

        int[][] matrix = Main.generatePrimeMatrix(n, min, max);

        // Перевірка на правильність розміру матриці
        assertEquals(n, matrix.length);
        for (int i = 0; i < n; i++) {
            assertEquals(n, matrix[i].length);
        }

        // Перевірка на простоту елементів матриці
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                assertTrue(Main.isPrime(matrix[i][j]));
            }
        }
    }

    @Test
    void testGetPrimes() {
        int min = 2; // Мінімальне значення простого числа
        int max = 20; // Максимальне значення простого числа

        int[] primes = Main.getPrimes(min, max);

        // Перевірка на правильну кількість простих чисел у масиві
        int expectedCount = 8; // Прості числа від 2 до 20: 2, 3, 5, 7, 11, 13, 17, 19
        assertEquals(expectedCount, primes.length);

        // Перевірка на простоту кожного числа у масиві
        for (int i = 0; i < primes.length; i++) {
            assertTrue(Main.isPrime(primes[i]));
        }
    }

    @Test
    void testIsPrime() {
        // Перевірка для простих чисел
        assertTrue(Main.isPrime(2));
        assertTrue(Main.isPrime(3));
        assertTrue(Main.isPrime(5));
        assertTrue(Main.isPrime(7));
        assertTrue(Main.isPrime(11));
        assertTrue(Main.isPrime(13));
        assertTrue(Main.isPrime(17));
        assertTrue(Main.isPrime(19));

        // Перевірка для складних чисел
        assertFalse(Main.isPrime(1));
        assertFalse(Main.isPrime(4));
        assertFalse(Main.isPrime(6));
        assertFalse(Main.isPrime(8));
        assertFalse(Main.isPrime(9));
        assertFalse(Main.isPrime(10));
        assertFalse(Main.isPrime(12));
        assertFalse(Main.isPrime(15));
        assertFalse(Main.isPrime(16));
        assertFalse(Main.isPrime(18));
        assertFalse(Main.isPrime(20));
    }
}
