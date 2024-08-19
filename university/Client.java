package university;

import java.io.IOException;
import java.util.Scanner;

import dp.chain_responsipility_part_3.ApprovedGrade;
import dp.chain_responsipility_part_3.HandlerDean;
import dp.chain_responsipility_part_3.HandlerHeadeDepartment;
import dp.chain_responsipility_part_3.HandlerInstructor;
import dp.singleton_part_3.Database;
import dp.singleton_part_3.Manager;
import dp.singleton_part_3.Singleton;
import dp.template_part_3.HTMLPrinter;
import dp.template_part_3.Order;
import dp.template_part_3.Printer;
import dp.template_part_3.TextPrinter;

public class Client {

	public static void main(String[] args) throws IOException {

		// Singleton design patterns
		Manager cm1 = Manager.getInstance();
		Database db1;
		System.out.println("Server name: " + cm1.get("Server name"));
		System.out.println("Port: " + cm1.get("Port"));
		db1 = Database.GetInstance();
		db1.getConnection();
		System.out.println("Username: " + cm1.get("Username"));
		System.out.println("Password" + cm1.get("Password"));

		// new object for School 1:
		School s1 = new School("1", "School of Computing and Informatics", "dean.Mohammad");

		// new object for Instructor (Assocition class for students and Instructor)
		InstructorStudent instractorA = new InstructorStudent(10, "Eng.Wajd", s1);
		Instructor instractor1 = new Instructor(2500);

		// new object for 3 Program for School Computing
		Program program1 = new Program("1", "Computer Science", 75, "Head.Moath");
		Program program2 = new Program("2", "Cyber Securty", 75, "Head.Hamzah");
		Program program3 = new Program("3", "Data Science", 75, "Head.Hasan");

		// new object for Student (Assocition class for students and Instructor)
		InstructorStudent studentA = new InstructorStudent(100100, "Hussin", s1);
		Student student1 = new Student(program1);

		// new object for 4 Courses for School Computing
		Courses course11 = new Courses(1111, "Softwaer And Hardwaer", 3);
		Courses course12 = new Courses(1112, "Desin Application", 4);
		Courses course13 = new Courses(1113, "Networking", 5);
		Courses course14 = new Courses(1114, "Security", 6);

		// new object for School 2:
		School s2 = new School("2", "School of Engineering Technology", "dean.Malk");

		// new object for Instructor (Assocition class for students and Instructor)
		InstructorStudent instractorB = new InstructorStudent(11, "Eng.Emad", s2);
		Instructor instractor2 = new Instructor(1500);

		Program program4 = new Program("10", "Energy Engineering", 100, "DR.Muyed");
		Program program5 = new Program("11", "Electrical Engineering", 100, "DR.Brandn");
		Program program6 = new Program("12", "Mechanical Engineering", 100, "DR.Ismail");

		// new object for Student (Assocition class for students and Instructor)
		InstructorStudent studentB = new InstructorStudent(200200, "Ali", s2);
		Student student2 = new Student(program5);

		// new object for 4 Courses for School Engineering
		Courses course21 = new Courses(2221, "Design MATLAB", 2);
		Courses course22 = new Courses(2222, "Planing Spaces And house", 1);
		Courses course23 = new Courses(2223, "Engineering Math        ", 5);
		Courses course24 = new Courses(2224, "Eltrasonic", 4);

		// new object for 4 Courses for two Schools
		Courses course31 = new Courses(101, "Soft Skills", 2);
		Courses course32 = new Courses(102, "Bootcamp", 6);
		Courses course33 = new Courses(103, "Work Shop", 4);
		Courses course34 = new Courses(104, "Fanction Math", 3);

		// Template Design Pattern:-
		int c = 0;
		int i = 0;
		String s = "";
		while (c != 3) {
			System.out.println("Student of register Courses: - ");
			System.out.println("1- Payment fees then rigester courses");
			System.out.println("2- Regsiter courses then payment fees");
			System.out.println("3- Exit");
			System.out.print("Enter your choice of registering Courses:  ");
			c = new Scanner(System.in).nextInt();
			System.out.println("*******************************************");
			switch (c) {
			case 1: {

				Context context = new Context(new OperationPayment__Register());
				System.out.println(s + context.executeStrategy(s));
				System.out.print("Enter the amount of money to register courses: ");
				i = new Scanner(System.in).nextInt();
				int money = i;
				System.out.println("Semester the registration courses schedule: " + course11 + course12 + course13
						+ course14 + course21 + course22 + course23 + course24 + course31 + course32 + course33
						+ course34);

				CourseStudent studentcourse11 = new CourseStudent(course21, "Summer", "ABC21");
				CourseStudent studentcourse12 = new CourseStudent(course22, "Summer", "ABC22");
				CourseStudent studentcourse13 = new CourseStudent(course23, "Summer", "ABC23");
				CourseStudent studentcourse14 = new CourseStudent(course31, "Summer", "ABC31");

				student2.addCourse(studentcourse11, studentcourse12, studentcourse13, studentcourse14);
				System.out.println(student2);
				System.out.println("Courses Calculate Fees are:" + student2.calculateFees());
				System.out.println("The rest of the extra funds after registration of courses: "
						+ (money - student2.calculateFees()));
				student2.dropCourse(studentcourse11);
				System.out.println("The after drop course rest of the extra funds after registration of courses: "
						+ (money - student2.calculateFees()));
				System.out.println(student2);
				System.out.println("********************");
			}
				break;
			case 2: {
				int b = 0;
				Context context = new Context(new OperationRegister__Payment());
				System.out.println(s + context.executeStrategy(s));
				System.out.println("Semester the registration courses schedule: " + course11 + course12 + course13
						+ course14 + course21 + course22 + course23 + course24 + course31 + course32 + course33
						+ course34);

				CourseStudent studentcourse1 = new CourseStudent(course11, "Summer", "ABS11");
				CourseStudent studentcourse2 = new CourseStudent(course12, "Summer", "ABC12");
				CourseStudent studentcourse3 = new CourseStudent(course13, "Summer", "ABC13");
				CourseStudent studentcourse4 = new CourseStudent(course34, "Summer", "ABC34");
				student1.addCourse(studentcourse1, studentcourse2, studentcourse3, studentcourse4);
				System.out.println(student1);
				System.out.println("Courses Calculate Fees are: " + student1.calculateFees());
				System.out.print("Pay the fee the courses to addition the schedule: ");
				b = new Scanner(System.in).nextInt();
				System.out.println("********************");

			}
				break;
			case 3: {
				break;
			}

			default: {
				throw new IllegalArgumentException("Unexpected value: You must enter a valid value ");
			}
			}

		}
		// new object for 4 Exam for Courses
		// builder design pattern
		WhightExam exam1 = new BuliderExams(20, 25).setThirdexam(30).buildExam();
		WhightExam exam2 = new BuliderExams(30, 20).setSecondexam(10).buildExam();
		WhightExam exam3 = new BuliderExams(20, 20).setSecondexam(10).setFirstexam(11).buildExam();
		WhightExam exam4 = new BuliderExams(10, 20).setSecondexam(20).buildExam();

		instractor1.addExams(exam1);
		instractor1.addExams(exam2);
		instractor1.addExams(exam3);
		instractor1.addExams(exam4);

		CourseStudent studentcourse1 = new CourseStudent(course11, "Summer", "ABS11", instractor1.getGrade(exam1),instractor1.sumGrade(exam1));
		CourseStudent studentcourse2 = new CourseStudent(course12, "Summer", "ABC12", instractor1.getGrade(exam2),instractor1.sumGrade(exam2));
		CourseStudent studentcourse3 = new CourseStudent(course13, "Summer", "ABC13", instractor1.getGrade(exam3),instractor1.sumGrade(exam3));
		CourseStudent studentcourse4 = new CourseStudent(course34, "Summer", "ABC34", instractor1.getGrade(exam4),instractor1.sumGrade(exam4));

		student1.addCourse(studentcourse1, studentcourse2, studentcourse3, studentcourse4);
		student1.calculateAverage(exam1, exam2, exam3, exam4);
		System.out.println("The Average GPA : " + student1.calculateAverage(exam1, exam2, exam3, exam4));

		// Template Design pattern:-
		Order order = new Order(1);

		Printer orderPrinter = new TextPrinter();

		orderPrinter.printOrder(order, "d:\\ABC.txt", studentA, student1, student1.getCoursesStudent());

		orderPrinter = new HTMLPrinter();
		orderPrinter.printOrder(order, "d:\\ABC.html", studentA, student1, student1.getCoursesStudent());

		HandlerInstructor handler1 = new HandlerInstructor();
		HandlerHeadeDepartment handler2 = new HandlerHeadeDepartment();
		HandlerDean handler3 = new HandlerDean();

		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);

		handler1.handleLink(new ApprovedGrade("instructor"));
		handler2.handleLink(new ApprovedGrade("head"));
		handler3.handleLink(new ApprovedGrade("dean"));

	}


}
