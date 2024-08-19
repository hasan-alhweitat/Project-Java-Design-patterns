package dp.chain_responsipility_part_3;

public class HandlerDean implements Handler {

	private Handler handler;

	@Override
	public void setNextHandler(Handler handler) {
		this.handler = handler;
	}

	@Override
	public void handleLink(ApprovedGrade grade) {
		if (grade.getAproved().toLowerCase().contains("dean")) {
			System.out.println("The Dean: Yes Approved the Grade");
		} else {
			System.out.println("The Dean : No didn't Approved the Grade");
			handler.handleLink(grade);
		}
	}

}
