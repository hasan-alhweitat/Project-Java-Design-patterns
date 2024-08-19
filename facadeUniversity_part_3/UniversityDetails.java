package dp.facadeUniversity_part_3;

public class UniversityDetails {

	private University schoolcomputing;
	private University schoolengneering;

	public UniversityDetails() {
		schoolcomputing = new School();
		schoolengneering = new School();
	}

	public void school1() {
		schoolcomputing.nameSchool1();
		schoolcomputing.nameProgram1();
	}

	public void school2() {
		schoolengneering.nameSchool2();
		schoolengneering.nameProgram2();
	}
}
