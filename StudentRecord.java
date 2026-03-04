import java.util.ArrayList;

public class StudentRecord extends Student {
	
	private ArrayList<String> courses;		//Create an array of strings to store firstName, lastName, and IDNo
	public StudentRecord(String firstName, String lastName, String IDno){ //Create StudentRecord() method with data firstName, lastName, and IDNo
		super(firstName, lastName, IDno);  //Refer to the parent class Student()
		courses = new ArrayList<>();
	}
	
	public void addCourse(String course) {	//If array "course" does not contain such course, add course from "courses"
		if(!(courses.contains(course))) {		//Is the course already in the list? If true, then ignore. If not, then add it to the list. contains() to find out if a string contains a sequence of characters/find out if a course from "courses" matches to "course". If true, then add(course)
			courses.add(course);			//add() to add a course from "courses" to "course"
		}
	}
	public void dropCourse(String course) {
		courses.remove(course);				//remove() to remove course from "courses"
	}
	
	public ArrayList<String> getCourses(){	//Encapsulates "courses" to protect student data. You don't want someone to mess up all of your data, do you?
		return courses;						//Further way to encapsulate "courses" by creating a copy of the original. Example: You take a picture of the Mona Lisa. Sure it's Mona Lisa, but you dont possess the actual painting. 
	}
	
	@Override
	public String toString() {
		String courseOutput;
		if(courses.isEmpty()) {		//If no courses are found, print "No course(s) found."
			courseOutput = "No course(s) found.";
		} else {
			courseOutput = courses.toString();
		}
		return super.toString() + " | Courses: " + courseOutput;  //Calls toString from Student.java, copies string format and adds with this one. 
	}
}
