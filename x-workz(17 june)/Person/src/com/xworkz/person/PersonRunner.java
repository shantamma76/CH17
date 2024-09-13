package com.xworkz.person;

public class PersonRunner {
	
	 public static void main(String[] args) {
	        // Create 5 Person instances
		    Person person1 =new  Person("yash","yash@gmail.com",38,"9535841644");
		    Person person2 = new Person("Radhika", "radhe@example.com", 40, "0987654321");
	        Person person3 = new Person("Chanchala", "chanchala@example.com", 22, "5551234567");
	        Person person4 = new Person("Arjun", "arjun@example.com",30 , "5559876543");
	        Person person5 = new Person("Amrutha", "amu@example.com", 25, "5555555555");
	        
	        Person[] people = { person1, person2, person3, person4, person5 };
	        
	        for (Person person : people) {
	            System.out.println(person);
	       
	        }
	 }
}

