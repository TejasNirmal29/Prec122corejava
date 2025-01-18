package in.day11.accesmodifier.signalton;

public class SignaltonDemo {
	private static SignaltonDemo object1;
	private SignaltonDemo(){};
	static {
		object1=new SignaltonDemo();
	}
	public static SignaltonDemo getobject() {
		return object1;
	}
		
		
		
		
	}
	
