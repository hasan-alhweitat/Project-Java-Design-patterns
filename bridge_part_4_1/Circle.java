package dp.bridge_part_4_1;

public class Circle extends Shape {

	public Circle(Color color1, Color color2) {
		super(color1, color2);
	}

	@Override
	public void manufacture() {
		System.out.print("Circle: ");
		color1.WorkColor();
		color2.WorkColor();
	}

}
