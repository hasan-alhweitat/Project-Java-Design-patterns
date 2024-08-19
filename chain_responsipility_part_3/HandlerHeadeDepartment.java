package dp.chain_responsipility_part_3;

public class HandlerHeadeDepartment implements Handler {

	private Handler handler;

	@Override
	public void setNextHandler(Handler handler) {
		this.handler = handler;
	}

	@Override
	public void handleLink(ApprovedGrade grade) {
		if (grade.getAproved().toLowerCase().contains("head")) {
			System.out.println("The Head: Yes Approved the Grade");

		} else {
			System.out.println("The Head: No didn't Approved the Grade");
			handler.handleLink(grade);
		}
	}

}
