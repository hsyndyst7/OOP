package oop7;

class OnsiteCourse extends Course {
    private String classroom;

    public OnsiteCourse(String courseName, int credit, String classroom) {
        super(courseName, credit);
        this.classroom = classroom;
    }

    public void changeClassroom(String newClassroom) {
        classroom = newClassroom;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Classroom: " + classroom);
        System.out.println();
    }
}
