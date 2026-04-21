package oop7;

public class Course {
	  protected String courseName;
	    protected int credit;

	    public Course(String courseName, int credit) {
	        this.courseName = courseName;
	        this.credit = credit;
	    }

	    public void increaseCredit(int amount) {
	        credit += amount;
	    }

	    public void displayInfo() {
	        System.out.println("Course: " + courseName);
	        System.out.println("Credit: " + credit);
	    }
}
