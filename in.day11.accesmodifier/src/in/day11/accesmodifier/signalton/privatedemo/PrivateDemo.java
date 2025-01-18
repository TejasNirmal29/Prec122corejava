package in.day11.accesmodifier.signalton.privatedemo;

public class PrivateDemo {
	private int var1;
	private int var2;
	
	private void setVariable() {
		var1=1;
		var2=1;
		
	}
	public PrivateDemo(int var1,int var2) {
		if(var1<0 && var2<0 ) 
			setVariable();
		else
		{
			this.var1=var1;
			this.var2=var2;
		}
		
	}
	public int getVar1() {
		return var1;
	}
	public void setVar1(int var1) {
		this.var1 = var1;
	}
	public int getVar2() {
		return var2;
	}
	public void setVar2(int var2) {
		this.var2 = var2;
	}
	@Override
	public String toString() {
		return "PrivateDemo [var1=" + var1 + ", var2=" + var2 + "]";
	}
	

}
