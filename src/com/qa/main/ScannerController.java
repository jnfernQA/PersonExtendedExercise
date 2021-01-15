package com.qa.main;

public class ScannerController {
	

	public static void scannerController() {
		
		System.out.println("Scanner is running.");
		
		//dummy data
		
		Person p1 = new Person("Dummy", 1, "Dummy");
		
		
		//create list for people
		
		PersonManager people = new PersonManager();
		
		//Add Dummy List
		people.addPeople(p1);
		
		
		//variables
		
		String name;
		int age;
		String jobTitle;
		boolean scanner = true;
		String result;
		
		//Removes Dummy List
		people.emptyList();
		
		while(scanner) {
			System.out.println("\nWhat method would your like to use?\rCREATE\rREMOVE\rLIST\rSEARCH\rEXIT");
			result = Runner.input.nextLine();
			switch(result) {
				case "CREATE":
				
					System.out.println("\nCREATE\rEnter Name: ");
					result = Runner.input.nextLine();
					name = result;

					System.out.println("Enter Age: ");
					result = Runner.input.nextLine();
					age = Integer.parseInt(result);
				

					System.out.println("Enter Job Title: ");
					result = Runner.input.nextLine();
					jobTitle = result;
				
					Person placeholderPerson = new Person(name, age, jobTitle);

					System.out.println("Created person:\r" + placeholderPerson);
					people.addPeople(placeholderPerson);
				
					break;
				case "REMOVE":
					System.out.println("\nREMOVE\rEnter Name To Remove (Do Not Remove 'Dummy'): \r");
					result = Runner.input.nextLine();
					name = result;
					System.out.println("Removed person:\r" + name);
					people.removeByName(name);
					break;
				case "LIST":
					System.out.println("\nLIST\rPeople:");
					people.printList();
					break;
				case "SEARCH":
					System.out.println("\nSEARCH\rEnter Name: ");
					result = Runner.input.nextLine();
					name = result;
					people.findByName(name);
					break;
				
				case "EXIT":
					System.out.println("\rclosing down");
					scanner=false;
					break;
				default:
					System.out.println("unknown entry");
					break;
			}
		}
	}
}
		
		
	
	
	


			
		
		
		
	


