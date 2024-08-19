package dp.bridge_part_4_1;

public class Square extends Shape {

	public Square(Color color1, Color color2) {
		super(color1, color2);
	}

	@Override
	public void manufacture() {
		System.out.print("Square: ");
		color1.WorkColor();
		color2.WorkColor();
	}

}
