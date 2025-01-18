package in.day11.accesmodifier.defaultclass;

public class HelperDefault {
	public String printString() {
		PrintString obj1=new PrintString ("rggrh");
		return obj1.getStr();
	}
	public int printDigit() {
		PrintDigit obj2=new PrintDigit (45);
		return obj2.getVariable();
	}

}
