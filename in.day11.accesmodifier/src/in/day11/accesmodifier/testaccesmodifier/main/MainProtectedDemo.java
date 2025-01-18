package in.day11.accesmodifier.testaccesmodifier.main;

import in.day11.accesmodifier.testaccesmodifier.ProtectedDemo;

public class MainProtectedDemo extends ProtectedDemo {
	public static void main(String[] args) {
		MainProtectedDemo demo=new MainProtectedDemo();
		demo.msg="hello";
		demo.printDefaultDemo2message();
	}

}
