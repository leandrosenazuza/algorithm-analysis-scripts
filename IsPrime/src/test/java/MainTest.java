import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class MainTest {

    @Test
    public void testBasic() {
        assertFalse("0  is not prime", Main.isPrime(0));
        assertFalse("1  is not prime", Main.isPrime(1));
        assertTrue ("2  is prime",     Main.isPrime(2));
        assertTrue ("73 is prime",     Main.isPrime(73));
        assertFalse("75 is not prime", Main.isPrime(75));
        assertFalse("-1 is not prime", Main.isPrime(-1));
    }

    @Test
    public void testPrime() {
        assertTrue("3 is prime", Main.isPrime(3));
        assertTrue("5 is prime", Main.isPrime(5));
        assertTrue("7 is prime", Main.isPrime(7));
        assertTrue("41 is prime", Main.isPrime(41));
        assertTrue("5099 is prime", Main.isPrime(5099));
    }

    @Test
    public void testBasicForIsPrimeOptimized() {
        assertFalse("0  is not prime", Main.isPrimeOptimized(0));
        assertFalse("1  is not prime", Main.isPrimeOptimized(1));
        assertTrue ("2  is prime",     Main.isPrimeOptimized(2));
        assertTrue ("73 is prime",     Main.isPrimeOptimized(73));
        assertFalse("75 is not prime", Main.isPrimeOptimized(75));
        assertFalse("-1 is not prime", Main.isPrimeOptimized(-1));
        assertFalse("1612917959 is not prime", Main.isPrimeOptimized(1612917959));
    }

    @Test
    public void testPrimeForIsPrimeOptimized() {
        assertTrue("3 is prime", Main.isPrimeOptimized(3));
        assertTrue("5 is prime", Main.isPrimeOptimized(5));
        assertTrue("7 is prime", Main.isPrimeOptimized(7));
        assertTrue("41 is prime", Main.isPrimeOptimized(41));
        assertTrue("5099 is prime", Main.isPrimeOptimized(5099));
    }
}