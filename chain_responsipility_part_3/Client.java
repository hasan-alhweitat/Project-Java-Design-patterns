package dp.chain_responsipility_part_3;

public class Client {

	public static void main(String[] args) {
		HandlerInstructor handler1 = new HandlerInstructor();
		HandlerHeadeDepartment handler2 = new HandlerHeadeDepartment();
		HandlerDean handler3 = new HandlerDean();

		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);

		handler1.handleLink(new ApprovedGrade("instructor"));
		handler2.handleLink(new ApprovedGrade("head"));
		handler3.handleLink(new ApprovedGrade("dean"));

	}

}
