package oop;

public class Student {
	private String ssn;
	private static int iD = 1000;
	private String userID;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String name;
	
	public Student(String name, String ssn) {
		this.ssn=ssn;
		this.name=name;
		createEmail(this.name);
		iD++;
		setUserID();
		System.out.println("[New student has been created. Student ID: " + userID + ", Student Email: "+ email +"]");
					
	}
	
	private void createEmail(String name) {
		email = name + "@uni.com";		
	}
	
	private void setUserID() {
		//user is a combination of Static ID, random 4-digit 
		//number between 1000 and 9000, and last 4 of SSN
		int upperBound = 1000;
		int lowerBound = 9000;
		int randomNumber = lowerBound + (int)(Math.random() * ((upperBound - lowerBound) + 1));
		
		userID = iD + ""+ randomNumber + ssn.substring(ssn.length()-4,ssn.length());
	}
	
	public void enroll(){
		System.out.println("enrolling student");
	}
	public void pay(){
		System.out.println("pay bill?");
	}
	public void checkBalance(){
		System.out.println("Checking balance");
	}
	
	@Override
	public String toString(){
		return "Student Name: " + name + "\nStudent ID; " + userID +"\nStudent Email Address: " + email;
		
	}
	public void showCourses() {
		System.out.println("Show courses");
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


}
