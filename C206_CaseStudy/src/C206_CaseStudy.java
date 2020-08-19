import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Transaction> TransactionList = new ArrayList<Transaction>();
		ArrayList<Transaction> ArchiveTransactionList = new ArrayList<Transaction>();
int option = -1;
		
		while (option != 5) {

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
public static void addTransaction(ArrayList<Transaction> transactionList, Transaction t) {

    transactionList.add(t);
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

}
