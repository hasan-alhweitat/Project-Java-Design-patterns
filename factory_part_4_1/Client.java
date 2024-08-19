package dp.factory_part_4_1;

public class Client {

	public static void main(String[] args) {

		ShapeFactory factory = new ShapeFactory();

		Shape shape = factory.getShape("SQUARESHAPE");
		shape.drawUser();

		shape = factory.getShape("REQTANGLESHAPE");
		shape.drawUser();

	}

}
