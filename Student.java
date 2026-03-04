
public class Student implements Comparable<Student> {
	
	//private instance variables
	private String firstName;
	private String lastName;
	private String IDNo;
	
	//create Student()
	public Student(String firstName, String lastName, String IDNo) { //Create method Student() that contains data(student's firstName, lastName, IDNo)
		//(this) to refer to current object in the method
		this.firstName = firstName;
		this.lastName = lastName;
		this.IDNo = IDNo;
	}
		
		//Get and set to encapsulate firstName, lastName, and IDNo
		public String getFirstName() {
			return firstName; 		//returns the current firstName from the constructor's parameters
		}
		public String getLastName() {
			return lastName;		//returns the current lastName
		}
		public String getIdNo() {
			return IDNo;			//returns the current IDNo
		}
		
		//Setters
		public void setFirstName(String firstName) {
			this.firstName = firstName;		//sets current value to parameter
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;		//sets current value to parameter
		}
		public void setIdNo(String IDNo) {
			this.IDNo = IDNo;				//sets current value to parameter
		}

		//equals - compares IDNo. 
		@Override
		public boolean equals(Object obj) {
			if(this == obj) {  //Checks if the string from the method is the same as string from the object. both references are pointing to the same object in memory. if the current Student object (this) equals to obj's object (obj).
				return true;	//returns true if strings from "this" and "obj" are equal. 
			}
			if(!(obj instanceof Student)) {  //If the object in "obj" is not an instance of Student class.
				return false;
			}
			Student other = (Student) obj; //If conditions are true, convert object from obj to "other" when it's been verified that it is an instance of the Student class.
			return this.IDNo.equals(other.IDNo); //Returns the strings and Id numbers that are equal. Basically saying two students are equal if their ID numbers are equal.
		}
		
		//compareTo - Alphabetize by last name, then first name
		@Override
		public int compareTo(Student other) {  //"other" representing the object from Student to be compared
			int lastNameCompare = this.lastName.compareToIgnoreCase(other.lastName); //compareToIgnoreCase() to compare two strings lexicographically indifferent of lower and upper case differences. Returns 0 if the two strings are the same. 
			
			if(lastNameCompare != 0) {  
				return lastNameCompare; //If it doesn't return 0, then return object
			}
			
			return this.firstName.compareToIgnoreCase(other.firstName); 
		}
		
		//toString - Formatted output
		@Override
		public String toString() {
			return lastName + ", " + firstName + ", ID: " + IDNo + " ";
		}
}
 