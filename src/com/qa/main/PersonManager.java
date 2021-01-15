package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
	

	List<Person> people = new ArrayList<>();
	
	public void addPeople(Person input) {
		people.add(input);
	}
	
	public void printAllNames() {
		for (Person p : people) {
			System.out.println(p.getName());
			
		}
		
	}
	
	public void printList() {
		for (Person p : people) {
			System.out.println(p);
			
		}
	}
	public void findByName(String name) {
		for (Person p : people) { //for every person we find in the list
			if(p.getName() .equals (name)) {// check if person name is equal to string we provide it
				
				System.out.println("Person found!\r" + p);
				
				
			}else {
				System.out.println("Person not found");
			}
		}
	}	
	public void removeByName(String Person) {
		for (Person p : people) {
			if(p.getName().equals(Person)) {
				people.remove(p);
				System.out.println(p + " has been removed");
				
			}else {
				System.out.println("Removed");
			}
		}
	}
		//if not not found name in Any Person in that list then:
		//print not found
		 // don't return anything

	public void emptyList() {
		people.clear();
		
	}


}
