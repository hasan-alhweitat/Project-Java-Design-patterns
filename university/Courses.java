package university;

public class Courses {

	private int id;
	private String name;
	private int credithours;

	public Courses() {

	}

	public Courses(int id, String name, int credithours) {
		super();
		this.id = id;
		this.name = name;
		this.credithours = credithours;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredithours() {
		return credithours;
	}

	public void setCredithours(int credithours) {
		this.credithours = credithours;
	}

	@Override
	public String toString() {
		return "Course: Id: " + id + ", Name Course: " + name + ", Credit Hours: " + credithours + "";
	}

}
