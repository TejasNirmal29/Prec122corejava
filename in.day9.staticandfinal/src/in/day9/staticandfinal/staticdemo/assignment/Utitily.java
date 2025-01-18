package in.day9.staticandfinal.staticdemo.assignment;

public class Utitily {
	static float PI=3.14F;
	public static double power(double base,double expo) {
		double power=1;
		for (int i = 0; i <=expo; i++) {
			power*=base;
			
		}
		return power;
	}
	public static double addition(double number1,double number2) {
		return number1+number2;
		
	}
	public static double multipication(double number1,double number2) {
		return number1*number2;
		
	}
	public static double subration(double number1,double number2) {
		return number1*number2;
		
	}
	public static double areaOfcircle(double radius) {
		
		return PI*radius*radius;
		
	}

}
