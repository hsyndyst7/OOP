package oop5;

public class Student {
	public String name;
	public int[] grades;

	public Student(String name, int mGrade, int fGrade) {

		this.name = name;
		this.grades = new int[] { mGrade, fGrade };

	}

	public double getAverage() {

		return (grades[0] * 0.4) + (grades[1] * 0.6);

	}

	public void printInfo() {

		System.out.println("İsim: " + name);
		System.out.println("Vize notu: " + grades[0]);
		System.out.println("Final notu: " + grades[1]);
		System.out.println("Dönem sonu ortalaması: " + getAverage());
		System.out.println();

	}
}
