package corejavaproject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentManagementSystem 
{
	static class Student 
	{
		private String name;
		private int id;
		private int age;
		private double gpa;
		public Student(String name, int id, int age, double gpa)
		{
			this.name = name;
			this.id = id;
			this.age = age;
			this.gpa = gpa;
			}
		public String getName() 
		{
			return name;
			}
		public int getId() 
		{
			return id;
			}
		public int getAge() 
		{
			return age;
			}
		public double getGpa() 
		{
			return gpa;
			}
		}
	private List<Student> students;
	public StudentManagementSystem() 
	{
		students = new ArrayList<>();
		}
	public void addStudent(Student student)
	{
		students.add(student);
		System.out.println("Student added successfully.");
		}
	public void displayAllStudents()
	{
		if (students.isEmpty()) 
		{
			System.out.println("No students to display.");
			return;
			}
		System.out.println("List of students:");
		for (Student student : students)
		{
			System.out.println("Name: " + student.getName());
			System.out.println("ID: " + student.getId());
			System.out.println("Age: " + student.getAge());
			System.out.println("GPA: " + student.getGpa());
			System.out.println("-----------------------------");
			}
		}
	public static void main(String[] args)
	{
		StudentManagementSystem sms = new StudentManagementSystem();
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		while (running) 
		{
			System.out.println("Student Management System");
			System.out.println("1. Add student");
			System.out.println("2. Display all students");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.print("Enter student name: ");
				String name = scanner.next();
				System.out.print("Enter student ID: ");
				int id = scanner.nextInt();
				System.out.print("Enter student age: ");
				int age = scanner.nextInt();
				System.out.print("Enter student GPA: ");
				double gpa = scanner.nextDouble();
				Student student = new Student(name, id, age, gpa);
				sms.addStudent(student);
				break;
				case 2:
					sms.displayAllStudents();
					break;
					case 3:
						running = false;
						break;
						default:
							System.out.println("Invalid choice. Please try again.");
							break;
							}
			System.out.println();
			}
		System.out.println("Exiting the program. Goodbye!");
		}
		}

	

