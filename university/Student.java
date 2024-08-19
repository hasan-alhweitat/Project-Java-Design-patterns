package university;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private double average;
	private Program program;
	private List<CourseStudent> coursesstudent = new ArrayList<CourseStudent>();

	List<Courses> courses = new ArrayList<Courses>();

	public Student() {
	}

	public Student(Program program) {
		super();
		this.program = program;

	}

	public String getProgram() {
		return program.getNameprogram();
	}

	public List<CourseStudent> getCoursesStudent() {
		return coursesstudent;
	}

	public void setCoursesStudent(List<CourseStudent> coursesstudent) {
		this.coursesstudent = coursesstudent;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public void addCourse(CourseStudent... courses) {
		for (int i = 0; i < courses.length; i++) {
			coursesstudent.add(courses[i]);
		}
	}

	public void dropCourse(CourseStudent... courses) {
		for (int i = 0; i < courses.length; i++) {
			coursesstudent.remove(courses[i]);
		}
	}

	public double calculateFees() {
		double sumfees = 0;
		for (CourseStudent creditHoures : coursesstudent) {
			sumfees = sumfees + (creditHoures.getCourse().getCredithours() * program.getCredithourfees());
		}
		return sumfees;
	}

	public int totalCredit() {
		int calculatecredit = 0;
		for (CourseStudent creditHoures : coursesstudent) {
			calculatecredit = calculatecredit + (creditHoures.getCourse().getCredithours());
		}
		return calculatecredit;
	}

	public double calculateAverage(WhightExam... exams) {
		double averageGrade = 0;
		double totalGrade = 0;
		for (int i = 0; i < exams.length; i++) {

			for (WhightExam exam : exams) {

				totalGrade += ((exam.getFirstexam() + exam.getSecondexam() + exam.getThirdexam() + exam.getMidtermexam()
						+ exam.getFinalexam()));

			}
		}
		averageGrade = ((totalGrade / exams.length) / 100);
		average = averageGrade;
		return averageGrade;

	}

	@Override
	public String toString() {
		return "\nStudent:  Program: " + program + ", Student Courses: " + coursesstudent + ", The Average GPA: "
				+ average + "\n";
	}

}
