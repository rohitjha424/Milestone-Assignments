package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import entity.CustomerDetals;
import exception.Exceptions;

public class CustomerMain {
	
	static Scanner sc= new Scanner(System.in);
	
	

	public static void main(String[] args) {
		
		boolean exitOfProgram=true;
		
		System.out.println("Enter The number of customer Details you wish to Add");
		
		int noOfCustomers= sc.nextInt();
		
		//Creating a List of Customers
		List<CustomerDetals> customers= new ArrayList<>(noOfCustomers);
		
		for (int i = 1; i <= noOfCustomers; i++) {
			
			
			System.out.println("Enter ID of Customer "+i);
			int id= sc.nextInt();
			
			 System.out.println("Enter Name of Customer "+i);
			String name= sc.next();
			sc.nextLine();
			
			 System.out.println("Enter Purchase Amount of Customer "+i);
			int amount=sc.nextInt();
			
			CustomerDetals c= new CustomerDetals(id,name,amount);
			customers.add(c);	
		}
		
		
		
		
		
		while(exitOfProgram) {
			 System.out.println("Enter 1: for Displaying all customer records based on their purchaseAmount in descending order");
			 System.out.println("Enter 2: To Update a particular Customer’s purchasing amount");
			System.out.println("Enter 3: To Exit");
			
			int ch=sc.nextInt();
			
			
			switch(ch) {
			case 1:
				for (CustomerDetals customer : customers) {
					System.out.println(customer);
				}
				break;
				
				
			case 2:
				System.out.println("Enter customer id to be updated:");
				int id1=sc.nextInt();
				int flag=0;
				System.out.println("Enter new purchase amount");
				int amount1=sc.nextInt();
				for (CustomerDetals customer : customers) {
					if(customer.getId()==id1) {
						customer.setPurchaseAmount(amount1);
						System.out.println("Customer Updated");
						System.out.println(customer);
						flag=1;
					}
				}
				if(flag==0)
					throw new Exceptions("Customer Id not found");
				break;
				
				
			case 3:
				exitOfProgram=false;
			}
		}
	}

}
