package dp.chain_responsipility_part_3;

public interface Handler {

	void setNextHandler(Handler handler);

	void handleLink(ApprovedGrade grade);

}
