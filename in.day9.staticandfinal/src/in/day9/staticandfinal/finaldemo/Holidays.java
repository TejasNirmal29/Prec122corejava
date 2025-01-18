package in.day9.staticandfinal.finaldemo;

public final class Holidays {
	final String festival;
	final int noOfLeaves;
	public Holidays(String festival,int noOfLeaves) {
		this.festival=festival;
		this.noOfLeaves=noOfLeaves;
	}
	public String get() {
		return festival;
	}
	public final int getNoOfLeaves() {
		return noOfLeaves;
	}
	@Override
	public String toString() {
		return ("Festival:"+festival+", No of Holiday:"+noOfLeaves);
	}
	

}
