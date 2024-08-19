package dp.strategy_part_4_1;

public class Context {

	private Stratexy strategy;

	public Context(Stratexy strategy) {
		this.strategy = strategy;
	}

	public double executeStrategy(int r) {
		return strategy.doOperation(r);
	}

}
