package com.searching;

class OPPSCONCEPTS {
	String color;
	String type;
	
	public void write(){
		
		System.out.println(type + " writing with " + color + " color" );
	}
}

class OPPSCONCEPTCONSTRUTOR {
	String name;
	String Address;
	String classes;
	int rollnumber;
	char grade;
	
	public OPPSCONCEPTCONSTRUTOR(String Name,String address,String classes ,int roll ,char grade) {
		this.name = Name;
		this.Address = address;
		this.classes = classes;
		this.rollnumber = roll;
		this.grade  = grade;
	}
	
	public void printStudentInfo() {
		System.out.println("The Name of Student is " + name);
		System.out.println("The Student's Address is " + Address);
		System.out.println("The Student is  in" + classes);
		System.out.println("The ROll Number of Student is " + rollnumber);
		System.out.println("The Grade of student is " + grade);
	}
}
public class OOPS {
	
	public static void main(String args[]) {
	
		//Creating INstance of class
		OPPSCONCEPTS oops1 = new OPPSCONCEPTS();
		oops1.color = "black";
		oops1.type = "gel pen";
		oops1.write();
		
		
		//Creating instacne of class with construtor
		OPPSCONCEPTCONSTRUTOR oops2 = new OPPSCONCEPTCONSTRUTOR("Haroon","Wuyan","10th" , 19 , 'A');
		oops2.printStudentInfo();
	}

}
