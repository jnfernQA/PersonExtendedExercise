package com.qa.main;

public class Person {
	
	//Variables
	
		private String name;
		private int age;
		private String job_title;
		
		public Person(String name, int age, String job_title) {
			this.name = name;
			this.age = age;
			this.job_title = job_title;
			
		}
		//Getters and Setters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getJobTitle() {
			return job_title;
		}
		public void setJobTitle(String job_title) {
			this.job_title = job_title;
		}
		@Override
		public String toString() {
			return "Person [name = " + name +  ", age = " + age + ", job title = " + job_title + " ]";
		}	
		


}
