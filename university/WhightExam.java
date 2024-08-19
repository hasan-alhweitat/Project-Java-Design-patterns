package university;

public class WhightExam {

	private int midtermexam;
	private int finalexam;
	private int firstexam;
	private int secondexam;
	private int thirdexam;

	public WhightExam() {

	}

	public WhightExam(int midtermexam, int finalexam, int firstexam, int secondexam, int thirdexam) {
		super();
		this.midtermexam = midtermexam;
		this.finalexam = finalexam;
		this.firstexam = firstexam;
		this.secondexam = secondexam;
		this.thirdexam = thirdexam;
	}

	public int getFirstexam() {
		return firstexam;
	}

	public void setFirstexam(int firstexam) {
		this.firstexam = firstexam;
	}

	public int getSecondexam() {
		return secondexam;
	}

	public void setSecondexam(int secondexam) {
		this.secondexam = secondexam;
	}

	public int getThirdexam() {
		return thirdexam;
	}

	public void setThirdexam(int thirdexam) {
		this.thirdexam = thirdexam;
	}

	public int getMidtermexam() {
		return midtermexam;
	}

	public void setMidtermexam(int midtermexam) {
		this.midtermexam = midtermexam;
	}

	public int getFinalexam() {
		return finalexam;
	}

	public void setFinalexam(int finalexam) {
		this.finalexam = finalexam;
	}

	@Override
	public String toString() {
		return "Exams: First Exam: " + firstexam + ", Second Exam: " + secondexam + ", Third Exam: " + thirdexam
				+ ", Midterm Exam: " + midtermexam + ", Final Exam: " + finalexam + "\n";
	}

}
