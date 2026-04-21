package oop7;

public class Main {
	  public static void main(String[] args) {
	        OnlineCourse c1 = new OnlineCourse("GEN", 3, "Google Meet");
	        OnsiteCourse c2 = new OnsiteCourse("OOP", 5, "C-001");

	        c1.increaseCredit(1);
	        c1.changePlatform("Zoom");
	        c2.changeClassroom("C-002");

	        System.out.println("Course List:\n");
	        c1.displayInfo();
	        c2.displayInfo();
	    }
}
