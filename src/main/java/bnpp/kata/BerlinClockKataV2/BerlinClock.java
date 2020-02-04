package bnpp.kata.BerlinClockKataV2;

public class BerlinClock {

	public String convertSecondsToSecondsLamp(int seconds)
	{
		return (seconds%2==0)?"Y":"O";
	}

	public String convertHoursToFiveHoursRow(int hours)
	{
		if (hours>=5 && hours<=9)
			return "ROOO";
		else
			if (hours>=10 && hours<=14)
				return "RROO";
			else
				return "OOOO";
	}

}
