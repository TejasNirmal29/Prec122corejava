package in.day9.staticandfinal.finaldemo;

public class StaticDemo {
	static int variable;

	public static int getVariable() {
		return variable;
	}

	public static void setVariable(int variable) {
		
		StaticDemo.variable = variable;
	}
	public  void printVariable() {
		System.out.println(variable);
	}
	
	
}
