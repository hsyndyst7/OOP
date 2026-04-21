package oop7;

public class OnlineCourse extends Course {
    private String platform;

    public OnlineCourse(String courseName, int credit, String platform) {
        super(courseName, credit);
        this.platform = platform;
    }

    public void changePlatform(String newPlatform) {
        platform = newPlatform;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println();
    }
}
