package dp.strategy_part_4_1;

public class Client {

	public static void main(String[] args) {

		int num1 = 6;

		Context context = new Context(new OperationCircle());
		System.out.println("3.14 * r^2"+ " = " + context.executeStrategy(num1));

		context = new Context(new OperationSquare());
		System.out.println("r^2 "+" =" + context.executeStrategy(num1));
	}

}
