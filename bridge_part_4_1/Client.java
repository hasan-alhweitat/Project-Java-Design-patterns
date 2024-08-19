package dp.bridge_part_4_1;

public class Client {

	public static void main(String[] args) {

		Shape square = new Circle(new Red(), new Blue());
		square.manufacture();

		Shape circle = new Square(new Red(), new Blue());
		circle.manufacture();
	}

}
