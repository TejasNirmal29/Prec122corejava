package in.day9.staticandfinal.finaldemo.moreexample;

import in.day9.staticandfinal.finaldemo.StaticDemo;

public  class StaticExample {
	public static StaticDemo demo;
	public StaticExample() {
		demo=new StaticDemo();
	}
	public static void printData() {
	
		demo.printVariable();
	}
}
