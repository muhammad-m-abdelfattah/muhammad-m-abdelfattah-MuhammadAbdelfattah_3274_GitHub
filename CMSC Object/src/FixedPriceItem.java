
public class FixedPriceItem extends AbstractItem{
	private String description;
	private double charge;
	
	public FixedPriceItem(String aDescription, double aCharge) {
		description = aDescription;
		charge = aCharge;
	}
	public double getTotalPrice() {
		return charge;
	}
	public String getDescription(int length) {
		return String.format("%-" + (length - 13) + "s%8.2f", description, charge);
	}

}
