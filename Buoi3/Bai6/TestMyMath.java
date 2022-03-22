package Buoi3.Bai6;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * TestMyMath
 */
public class TestMyMath extends TestCase{

    @Test
    public void testGreatestCommonDivisor() {
        assertEquals(4, MyMath.greatestCommonDivisor(12, 8));
    }

    @Test
    public void testMinOfThree() {
        assertEquals(3.0, MyMath.minOfThree(7, 9, 3));
    }

    @Test
    public void testMaxOfThree() {
        assertEquals(9.0, MyMath.maxOfThree(7, 9, 3));
    }

    @Test
    public void testIsPrime() {
        assertEquals(true, MyMath.isPrime(2));
        assertEquals(true, MyMath.isPrime(3));
        assertEquals(false, MyMath.isPrime(1));
        assertEquals(true, MyMath.isPrime(23));
    }

    @Test
    public void testCeil() {
        assertEquals(2, MyMath.ceil(2.01));
        assertEquals(2, MyMath.ceil(2.41));
        assertEquals(1, MyMath.ceil(1.14));
        assertEquals(23, MyMath.ceil(23.12131));
    }

    @Test
    public void testSumToN() {
        assertEquals(1275, MyMath.sumToN(50));
    }

    @Test
    public void testAbsolute() {
        assertEquals(1, MyMath.absolute(-1));
    }
}
