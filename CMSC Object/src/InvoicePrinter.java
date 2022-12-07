import java.util.Scanner;

public class InvoicePrinter {
	
	static String read(String prompt, Scanner in) {
		System.out.println(prompt + ": ");
		return in.nextLine();
	}
	
	static Address readAddress(Scanner in) {
		System.out.println("Please enter an address (empty line to terminate)");
		String name = read("Name", in);
		if (name.equals(""))
			return null;
		String street = read("Street", in);
		String city = read("City", in);
		String state = read("State", in);
		String zip = read("Zip", in);
		return new Address(name, street, city, state, zip);
	}
	
	static Product readProduct(Scanner in) {
		System.out.println("Product description (empty line to terminate)");
		String description = in.nextLine();
		if (description.equals("")) {
			return null;
		}
		System.out.println("Price: ");
		double price = in.nextDouble();
		in.nextLine();
		return new Product(description, price);
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		System.out.println("This program reads an invoice (name, products purchased");
		System.out.println("and prints an invoice./n");
		Scanner in = new Scanner(System.in);
		Address address;
		
		while ((address = readAddress(in)) != null) {
			Invoice invoice = new Invoice(address);
			Product product;
			while ((product = readProduct(in)) != null) {
				System.out.println("Quantity: ");
				int quantitiy = in.nextInt();
				in.nextLine();
				invoice.add(product, quantitiy);
			}
			System.out.println(invoice.format());
		}
		
		
	}

}
