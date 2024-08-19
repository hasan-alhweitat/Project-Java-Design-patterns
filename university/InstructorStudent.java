package university;

public class InstructorStudent {
	private int id;
	private String nameInstrStud;
	private School school;

	public InstructorStudent() {

	}

	public InstructorStudent(int id, String nameInstrStud, School school) {
		super();
		this.id = id;
		this.nameInstrStud = nameInstrStud;
		this.school = school;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameInstrStud() {
		return nameInstrStud;
	}

	public void setNameInstrStud(String nameInstrStud) {
		this.nameInstrStud = nameInstrStud;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Instructor or Student:- Id: " + id + ", Name: " + nameInstrStud + ", School: " + school + ""
				+ "\n";
	}

}