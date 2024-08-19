package university;

public class School {
	private String id;
	private String nameschool;
	private String deanschool;

	public School() {

	}

	public School(String id, String nameschool, String deanschool) {
		super();
		this.id = id;
		this.nameschool = nameschool;
		this.deanschool = deanschool;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNameschool() {
		return nameschool;
	}

	public void setNameschool(String nameschool) {
		this.nameschool = nameschool;
	}

	public String getDeanschool() {
		return deanschool;
	}

	public void setDeandepartment(String deanschool) {
		this.deanschool = deanschool;
	}

	@Override
	public String toString() {
		return "School:- Id: " + id + ", Name School: " + nameschool + ", Dean Department: " + deanschool + "\n";
	}

}
