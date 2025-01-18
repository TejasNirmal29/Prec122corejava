package in.day9.staticandfinal.finaldemo.objectcount.main;

import in.day9.staticandfinal.finaldemo.objectcount.ObjectCount;

public class MainObjectCounter {
	public static void main(String[] args) {
		ObjectCount o1= new ObjectCount();
		ObjectCount o2= new ObjectCount();
		ObjectCount o3= new ObjectCount();
		ObjectCount o4= new ObjectCount();
		ObjectCount o5= new ObjectCount();
		ObjectCount o6= new ObjectCount();
		ObjectCount o7= new ObjectCount();
		System.out.println(o1.printCounter() % o2.printCounter() *o2.printCounter());
	}
}
