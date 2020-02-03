package bnpp.kata.BerlinClockKataV2;

public class BerlinClock {

	public String convertSecondsToSecondsLamp(int seconds)
	{
		return (seconds%2==0)?"Y":"O";
	}

}
