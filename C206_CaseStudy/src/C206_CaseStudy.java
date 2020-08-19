import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();

		productList.add(new Product(00, "Pork", "Food", "China Pork", "LiuJiaZhuRou"));
		productList.add(new Product(01, "Toothbrush", "Household", "Janpan toothbrush", "YuKu Brush"));

		int option = 0;

		while (option != 5) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all product
				C206_CaseStudy.viewAllProduct(productList);
			} else if (option == 2) {

				// Add product

				C206_CaseStudy.addProduct(productList);

			} else if (option == 3) {

				// delete product
				C206_CaseStudy.viewAllProduct(productList);

			} else if (option == 5) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}

	}

	public static void menu() {
		C206_CaseStudy.setHeader("RESOURCE CENTRE APP");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add item");
		System.out.println("3. Delete item");
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");

	}

	// Write the code for the viewAllProduct method.
	// Note: This method is a public static method that takes in an ArrayList of
	// Product objects.
	public static void viewAllProduct(ArrayList<Product> productList) {
		Helper.line(45, "=");
		System.out.println("Product List");
		Helper.line(45, "=");

		if (productList.isEmpty()) {
			System.out.println("There is no product available.");
		} else {
			String out = String.format("%-10s  %-5s %-15s %-20s %-5s\n ", "Product ID ", "Product Description",
					"Product Category ", "Product Name", "Vendor Name");
			for (int i = 0; i < productList.size(); i++) {
				Product ppp = productList.get(i);//
				out += String.format("%-10d %-5s %-20s  %-15s %-5s\n", ppp.getProductID(), ppp.getProductDescription(),
						ppp.getProductCategory(), ppp.getProductName(), ppp.getVendorName());
			}
			System.out.println(out);
		}
	}

	// add
	public static void addProduct(ArrayList<Product> productList) {
		int productID = Helper.readInt("Enter product ID: ");
		String productDescription = Helper.readString("Enter  product description: ");
		String productCategory = Helper.readString("Enter product category : ");
		String productName = Helper.readString("Enter product name: ");
		String vendorName = Helper.readString("Enter vendor name  : ");

		productList.add(new Product(productID, productDescription, productCategory, productName, vendorName));
		System.out.println("Product added");

	}

	public static void removefromlist(ArrayList<Product> productList) {
		Helper.line(45, "=");
		System.out.println("Remove");
		Helper.line(45, "=");

		boolean isFound = false;
		int id = Helper.readInt("Enter peoduct ID to delete item: ");
		String confirm = Helper.readString("Are you sure you want to delete product from list?(Y/N): ");

		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getProductID() == id) {
				if (confirm.equalsIgnoreCase("y")) {
					isFound=true;
					
				}
			} else {
				System.out.println("Invalid Product ID");

			}
			if(isFound==true) {
				productList.remove(i);
			}

		}
	}
	//
}
