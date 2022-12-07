
public class QuantityItem extends AbstractItem{
	
	Product product;
	private int quantity;
	private String ProductName;
	private double Price;
	private double TotalPrice;

	public QuantityItem(Product aProduct, int aQuantity) {
	product = aProduct;
	quantity = aQuantity;
	TotalPrice = quantity * product.getPrice();
	ProductName = product.getDescription();
	Price = product.getPrice();
		
	}
	public Product getProduct() {
		return product;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getTotalPrice() {
		return TotalPrice;
	}
	public String getDescription(int length) {
		return String.format("%-" + (length - 13) + "s%8.2f%5d", ProductName, Price, quantity, TotalPrice);
	}
	
}
