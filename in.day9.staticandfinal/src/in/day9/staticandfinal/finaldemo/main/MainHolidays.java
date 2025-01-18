package in.day9.staticandfinal.finaldemo.main;

import in.day9.staticandfinal.finaldemo.Holidays;

public class MainHolidays{
	public static void main(String[] args) {
		Holidays diwali=new Holidays("Diwali",365);
		Holidays dastra=new Holidays("Dastra",56);
		System.out.println(diwali);
		System.out.println(dastra);
	}

}
