package lab2;

public class student {
	
	private String name;
	private int year;
	private int ID;
	
	public student(String name, int id, int year) {
		this.name = name;
		this.ID = id;
		this.year = year;
	}
	public void displayDetails() {
		System.out.println("name: " + name);
		System.out.println("ID: " + ID);
		System.out.println("year of study: " + year);
	}
	public void incrementID() {
		ID+=1;
	}
	public static void main(String[] args) {
		student stud = new student("Grrrr", 1, 2024);
		stud.displayDetails();
		stud.incrementID();
		stud.displayDetails();		
	}

}