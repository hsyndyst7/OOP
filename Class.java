package oop5;

public class Class {
	private Student[] students;

	public Class(Student[] incomingStudents) {
		
		this.students = incomingStudents;
		
	}

	public void printClassReport() {
		
		System.out.println("Sınıf not çizelgesi: ");
		
		for (Student s : students) {
			s.printInfo();
		}
		
	}

	public void addBonus(int bonus) {
		
		System.out.println("Tüm öğrencilerin vize notlarına " + bonus + " puan eklenmiştir.");
		
		for (Student s : students) {
			
			if (s.grades[0] + bonus < 100) {
				s.grades[0] += bonus;
			}
			else if (s.grades[0]+ bonus >=100){
				s.grades[0]=100;}
			
		}
		
	}
	
}
