import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
<<<<<<< HEAD
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
=======
		// TODO Auto-generated method stub
		ArrayList<Transaction> TransactionList = new ArrayList<Transaction>();
		ArrayList<Transaction> ArchiveTransactionList = new ArrayList<Transaction>();
int option = -1;
		
		while (option != 6) {

			System.out.println("1. Transaction");
			System.out.println("2. -");
			System.out.println("3. -");
			System.out.println("4. -");
			System.out.println("5. Quit");
			Helper.line(80, "-");
			option = Helper.readInt("Enter an option : ");

			if (option == 1) {
			System.out.println("1. Add");
			System.out.println("2. View All");
			System.out.println("3. Archive");	
			int suboption=Helper.readInt("Enter option :");
			if(suboption==1) {
				C206_CaseStudy.addTransaction(TransactionList);
			}else if(suboption==2) {
				C206_CaseStudy.viewTransaction(TransactionList);
			}else if(suboption==3) {
				C206_CaseStudy.archiveOldTransaction(TransactionList, ArchiveTransactionList);
			}else {
				System.out.println("Invalid option");
			}
			} else if (option == 2) {
			
						
			} else if (option == 3) {
				
			} else if (option == 4) {
	
						
			}else if (option == 5) {
				System.out.println("Bye!");
			}else {
				System.out.println("Invalid option");
			}

		}

		
	}
		

	//=================Add====================================
public static void addTransaction(ArrayList<Transaction> TransactionList) {
		int transcationID= Helper.readInt("Transaction ID:");
		String customername=Helper.readString("Name of customer:");
		String productname=Helper.readString("Name of product:");
		String staffname=Helper.readString("Name of staff handling the return:");
		Transaction tra=new Transaction(transcationID, customername, productname, staffname);
		TransactionList.add(tra);
		System.out.println("Transaction added");
	}
	//=================view all=================================
public static String retrieveAllTransaction(ArrayList<Transaction> TransactionList) {
	String output="";
	for (int i = 0; i < TransactionList.size(); i++) {
		output += String.format("%-25d %-25s %-25s %-25s \n", TransactionList.get(i).getTranscationID(),TransactionList.get(i).getCustomername(),TransactionList.get(i).getProductname(),
				TransactionList.get(i).getStaffname());
	}
	return output;
}
public static void viewTransaction(ArrayList<Transaction> TransactionList) {
	Helper.line(80, "-");
	System.out.println("TRANSACTION LIST");
	Helper.line(80, "-");
	String output = String.format("%-25s %-25s %-25s %-25s \n", "TRANSACTION ID", "CUSTOMER NAME",
			"PRODUCT NAME","STAFF HANDLING NAME");
	 output += retrieveAllTransaction(TransactionList);	
	System.out.println(output);
}
	//=================Archive transactions===============================
public static void archiveOldTransaction(ArrayList<Transaction> TransactionList,ArrayList<Transaction> ArchiveTransactionList) {
		C206_CaseStudy.viewTransaction(TransactionList);
		String yesorno=Helper.readString("Do you want to archive transaction? (Yes/No) :");
		if(yesorno.equalsIgnoreCase("Yes")) {
		for(int i=0;i<TransactionList.size();i++) {
			ArchiveTransactionList.add(ArchiveTransactionList.size(),TransactionList.get(i));
		}
		TransactionList.clear();
		System.out.println("List has been archived");
					
	}
		
	}


>>>>>>> branch 'master' of https://github.com/19012453-MinShuang/C206_CaseStudy.git

	}

<<<<<<< HEAD
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
=======

>>>>>>> branch 'master' of https://github.com/19012453-MinShuang/C206_CaseStudy.git
