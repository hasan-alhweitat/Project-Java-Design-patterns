package university;

public class Program extends School {

	private String id;
	private String nameprogram;
	private int credithourfees;
	private String headdepartment;

	public Program() {

	}

	public Program(String id, String nameprogram, int credithourfees, String headdepartment) {
		super();
		this.id = id;
		this.nameprogram = nameprogram;
		this.credithourfees = credithourfees;
		this.headdepartment = headdepartment;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNameprogram() {
		return nameprogram;
	}

	public void setNameprogram(String nameprogram) {
		this.nameprogram = nameprogram;
	}

	public double getCredithourfees() {
		return credithourfees;
	}

	public String getHeaddepartment() {
		return headdepartment;
	}

	public void setHeaddepartment(String headdepartment) {
		this.headdepartment = headdepartment;
	}

	public void setCredithourfees(int credithourfees) {
		this.credithourfees = credithourfees;
	}

	@Override
	public String toString() {
		return "Program:- Id: " + id + ", Name Program: " + nameprogram + ", Credit Hour Fees: " + credithourfees
				+ ", Head Department: " + headdepartment + "\n";
	}

}
