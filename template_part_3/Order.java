package dp.template_part_3;

import java.time.LocalDate;

public class Order {

	private int id;
	private LocalDate date;

	public Order(int id) {
		this.id = id;
		this.date = LocalDate.now();
	}

	public int getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

}
