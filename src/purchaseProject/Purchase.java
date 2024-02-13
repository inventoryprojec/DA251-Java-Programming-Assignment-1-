package purchaseProject;

/*
 * Author : MD MOLLA
 * Course : DA251 Java Programming
 * Assignment : section 1, lesson 1 : Review Project 
 * Due Date : 15 February 2024.
 */
public class Purchase {
	private String itemName;
	private int quantity;
	private double price;

	/*
	 * constants variable // 8.75% divided by 100 which is 0.0875
	 */
	private static final double TAX_RATE = 0.0875;

	// Default constructor with default values
	public Purchase() {
		itemName = "Default Item";
		quantity = 1;
		price = 1.0;
	}

	// Getter and setter methods
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity <= 0) {
			System.out.println("Error: Quantity must be greater than zero.");
			System.exit(0);
		}
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price <= 0) {
			System.out.println("Error: Price must be greater than zero.");
			System.exit(0);
		}
		this.price = price;
	}

	public double calculateTotalCost() {

		// calculate price
		double subTotoal = quantity * price;
		System.out.println("price before tax : " + subTotoal);

		// calculate total tax per subTotal
		double tax = (subTotoal * TAX_RATE);

		System.out.println("total tax : " + tax);

		double priceIncludedTax = subTotoal + tax;

		System.out.println("Total Cost included tax : " + priceIncludedTax);

		return Math.round(priceIncludedTax);
	}

}
