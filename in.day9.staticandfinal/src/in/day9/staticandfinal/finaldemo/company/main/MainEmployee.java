package in.day9.staticandfinal.finaldemo.company.main;

import in.day9.staticandfinal.finaldemo.company.Employee;

public class MainEmployee {
	public static void main(String[] args) {
		Employee.setOrganizationName("Apple");
		Employee employee1=new Employee("abc", 3984586F, 76);
		Employee employee2=new Employee("suc", 65984586F, 54);
		Employee employee3=new Employee("njnnbgjjn", 395686F, 54);
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println();
		
		Employee.setOrganizationName("Microsoft");
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
	}

}
