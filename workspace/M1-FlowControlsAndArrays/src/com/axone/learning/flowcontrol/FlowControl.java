package com.axone.learning.flowcontrol;

public class FlowControl {

	
	public void useIfElse(String day)
	{
		if(day.equalsIgnoreCase("Mon")||day.equalsIgnoreCase("Tue")||day.equalsIgnoreCase("Wed"))
		{
			System.out.println("Weekday");
		}
		else if(day.equalsIgnoreCase("Thu"))
		{
			System.out.println("Midweek");
		}
		else if(day.equalsIgnoreCase("Thu"))
		{
			System.out.println("Midweek");
		}
		else if(day.equalsIgnoreCase("Sat")||day.equalsIgnoreCase("Sun"))
		{
			System.out.println("Weekend");
		}
		else
		{
			System.out.println("Invalid Day");
		}
	}
	public void useSwitch(String day)
	{
		switch(day)
		{
		case "Mon":
			System.out.println("Weekday");
			break;
		case "Tue":
			System.out.println("Weekday");
			break;
		case "Wed":
			System.out.println("Weekday");
			break;
		case "Thu":
			System.out.println("Midweek");
			break;
		case "Fri":
			System.out.println("Happy Friday");
			break;
		case "Sat":
			System.out.println("Weekend");
			break;
		case "Sun":
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Invalid Day");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowControl fcon = new FlowControl();
		fcon.useIfElse("Mon");
		fcon.useSwitch("Sun");
	}

}
