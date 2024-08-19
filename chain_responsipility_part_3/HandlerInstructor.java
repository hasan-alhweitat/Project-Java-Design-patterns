package dp.chain_responsipility_part_3;

public class HandlerInstructor implements Handler {

	private Handler handler;

	@Override
	public void setNextHandler(Handler handler) {
		this.handler = handler;
	}

	@Override
	public void handleLink(ApprovedGrade grade) {
		if (grade.getAproved().toLowerCase().contains("instructor")) {
			System.out.println("The Instructor : Yes Approved the Grade");

		} else {
			System.out.println("The Instructor : No didn't Approved the Grade");
			handler.handleLink(grade);
		}
	}

}
