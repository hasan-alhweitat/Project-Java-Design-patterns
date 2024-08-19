package university;

public class BuliderExams {

	private int finalexam;
	private int midtermexam;
	private int firstexam;
	private int secondexam;
	private int thirdexam;

	public BuliderExams(int midtermexam, int finalexam) {
		super();
		this.midtermexam = midtermexam;
		this.finalexam = finalexam;
	}

	public BuliderExams setFirstexam(int firstexam) {
		this.firstexam = firstexam;
		return this;
	}

	public BuliderExams setSecondexam(int secondexam) {
		this.secondexam = secondexam;
		return this;
	}

	public BuliderExams setThirdexam(int thirdexam) {
		this.thirdexam = thirdexam;
		return this;
	}

	public BuliderExams setMidtermexam(int midtermexam) {
		this.midtermexam = midtermexam;
		return this;
	}

	public BuliderExams setFinalexam(int finalexam) {
		this.finalexam = finalexam;
		return this;
	}

	public WhightExam buildExam() {
		return new WhightExam(firstexam, secondexam, thirdexam, midtermexam, finalexam);
	}
}
