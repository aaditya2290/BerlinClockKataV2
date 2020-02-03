package bnpp.kata.BerlinClockKataV2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BerlinClockTest {

	BerlinClock clock;

	@Before
	public void test() {
		clock=new BerlinClock();
	}

	@Test
	public void testSecondsLampOnForEvenSeconds()
	{
		assertEquals("Y",clock.convertSecondsToSecondsLamp(0));
	}

	@Test
	public void testSecondsLampOffForOddSeconds()
	{
		assertEquals("O",clock.convertSecondsToSecondsLamp(5));
	}

	@Test
	public void testFiveHoursRowContains4Lamps()
	{
		assertEquals(4,clock.convertHoursToFiveHoursRow(23).length());
	}

}
