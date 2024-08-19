package dp.facadeUniversity_part_3;

public class School implements University {
	private int id;
	private String nameschool;
	private String deandepartment;

	public School() {

	}

	public School(int id, String nameschool, String deandepartment) {
		super();
		this.id = id;
		this.nameschool = nameschool;
		this.deandepartment = deandepartment;
	}

	@Override
	public void nameSchool1() {
		System.out.println("School of Computing and Informatics");
	}

	@Override
	public void nameSchool2() {
		System.out.println("School of Engineering Technology");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameschool() {
		return nameschool;
	}

	public void setNameschool(String nameschool) {
		this.nameschool = nameschool;
	}

	public String getDeandepartment() {
		return deandepartment;
	}

	public void setDeandepartment(String deandepartment) {
		this.deandepartment = deandepartment;
	}

	@Override
	public String toString() {
		return "School: Id: " + id + ". Name:" + nameschool + ". Dean Department: " + deandepartment + "";
	}

	@Override
	public void nameProgram1() {
		System.out.println("1. Computer Science \n" + "2. Data Science \n" + "3. Cyber Securityn \n");
	}

	@Override
	public void nameProgram2() {
		System.out
				.println("1. Electrical Engineering \n" + "2. Mechanical Engineering \n" + "3. Energy Engineering \n");
	}

}
