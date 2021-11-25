import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeTest {

	@Test
	public final void testTwo()
	{
		assertTrue(Prime.isPrime(2));
	}
	
	@Test
	public final void testThree()
	{
		assertTrue(Prime.isPrime(3));
	}
	
	@Test
	public final void testFour()
	{
		assertFalse(Prime.isPrime(4));
	}
	
	@Test
	public final void testFive()
	{
		assertTrue(Prime.isPrime(5));
	}
	
	@Test
	public final void testSix()
	{
		assertFalse(Prime.isPrime(6));
	}
	
	@Test
	public final void testSeven()
	{
		assertTrue(Prime.isPrime(7));
	}
	
	

}
