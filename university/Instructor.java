package university;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Student {

	private double salary;
	private List<WhightExam> exams = new ArrayList<WhightExam>();

	public Instructor() {

	}

	public Instructor(double salary) {
		super();
		this.salary = salary;

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<WhightExam> getExams() {
		return exams;
	}

	public void addExams(WhightExam... exam) {

		for (int i = 0; i < exam.length; i++) {
			exams.add(exam[i]);
		}
	}

	public String getGrade(WhightExam... exams) {
		int totalGrade = 0;
		List<String> lll = new ArrayList<>();
		lll.add("A");
		lll.add("B");
		lll.add("C");
		lll.add("D");
		lll.add("F");
		String d = null;
		for (WhightExam exam : exams) {

			totalGrade += ((exam.getFirstexam() + exam.getSecondexam() + exam.getThirdexam() + exam.getMidtermexam()
					+ exam.getFinalexam()));
			if (totalGrade >= 90 && totalGrade <= 100) {
				System.out.println("Total Grade is: " + lll.get(0));
				d = lll.get(0);
			} else if (totalGrade >= 80 && totalGrade <= 89) {
				System.out.println("Total Grade is: " + lll.get(1));
				d = lll.get(1);
			} else if (totalGrade >= 70 && totalGrade <= 79) {
				System.out.println("Total Grade is: " + lll.get(2));
				d = lll.get(2);
			} else if (totalGrade >= 60 && totalGrade <= 69) {
				System.out.println("Total Grade is: " + lll.get(3));
				d = lll.get(3);
			} else {
				System.out.println("Total Grade is: " + lll.get(4));
				d = lll.get(4);
			}
			return d;
		}
		return d;
	}

	public int sumGrade(WhightExam... exams) {
		int totalGrade = 0;
		for (WhightExam exam : exams) {

			totalGrade += ((exam.getFirstexam() + exam.getSecondexam() + exam.getThirdexam() + exam.getMidtermexam()
					+ exam.getFinalexam()));

		}
		return totalGrade;
	}

	@Override
	public String toString() {
		return "Instructor:- Salary: " + salary + ", Exams: " + exams + "\n";
	}

}
