package cse360assign2;
//Nickolas Florez
//CSE360 Assignment 2
//Lecture: Mondays 3:05-4:20
//PIN: 375

public class Calculator {
	private int total; //total of method calculations
	private String history;

	public Calculator() {
		total = 0;  // not needed - included for clarity
		history = "0 ";
	}
	
	public int getTotal() { //should grab the total after methods used so far
		return total;

	}
	
	public void add(int value) {
		total = total + value; //add value to the total
		String val = Integer.toString(value); //cast int to String
		history += "+ " + val + " "; 
	}
	
	public void subtract(int value) {
		total = total - value; //subtract the value from the total
		String val = Integer.toString(value);
		history += "- " + val + " ";

	}
	
	public void multiply(int value) {
		total = total * value; //multiply the value by the total
		String val = Integer.toString(value);
		history += "* " + val + " ";

	}
	//if value is equal to 0, then total = 0
	//otherwise, divide value by the total
	public void divide(int value) {
		if(value == 0) {
			total = 0;
		} 
		else {
			total = total / value;
		}
		String val = Integer.toString(value); 
		history += "/ " + val + " ";	

	}
	//getHistory() will get the history values used in each 
	//successive method used. 
	public String getHistory() {
		return history;	
	}
}
