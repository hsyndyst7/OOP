package oop5;

public class Main {
	public static void main(String[] args) {

		Student[] list = { new Student("John", 45, 60), 
				new Student("Jane", 85, 90)
				, new Student("Joe", 30, 40) };

		Class myClass = new Class(list);
		

		myClass.printClassReport();

		myClass.addBonus(5);
		myClass.addBonus(15);


		System.out.println("Güncelleme Sonrası:");
		System.out.println();
		
		
		myClass.printClassReport();

	}

}
