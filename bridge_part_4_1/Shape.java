package dp.bridge_part_4_1;

public abstract class Shape {

	public Color color1;
	public Color color2;

	public Shape(Color color1, Color color2) {
		super();
		this.color1 = color1;
		this.color2 = color2;
	}

	public abstract void manufacture();
}
