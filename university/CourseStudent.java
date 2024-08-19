package university;

public class CourseStudent {

	private Courses course;
	private String semester;
	private String section;
	private String grade;
	private int sumgrade;

	public CourseStudent() {

	}

	public CourseStudent(Courses course, String semester, String section, String grade ,int sumgrade) {
		super();
		this.course = course;
		this.semester = semester;
		this.section = section;
		this.grade = grade;
		this.sumgrade= sumgrade;
	}

	public CourseStudent(Courses course, String semester, String section) {
		super();
		this.course = course;
		this.semester = semester;
		this.section = section;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getSumgrade() {
		return sumgrade;
	}

	public void setSumgrade(int sumgrade) {
		this.sumgrade = sumgrade;
	}

	@Override
	public String toString() {
		return "\nCourse Student: Course: " + course + ", Semester: " + semester + ", Section: " + section
				+ ", Sum Grades: " + sumgrade + ", Grade: " + grade + "\n";
	}

}
