package personExercise;

import java.util.ArrayList;

public class Person {

	private String name;
	private int age;
	private String jobTitle;

	public Person(String name, int age, String jobTitle) {

		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;

	}

	public String toString() {
		return "Name = " + name + "   " + "Age = " + age + "   " + "Job Title = " + jobTitle;
	}

	public static void main(String[] args) {

		ArrayList<Person> person = new ArrayList<>();
		Person p = new Person("Amrit Parajuli", 24, "Software Tester");
		Person p1 = new Person("John Doe", 33, "Security");
		Person p2 = new Person("Meow Meow", 2, "Tour Guide");
		person.add(p);
		person.add(p1);
		person.add(p2);
		for (Person i : person) {
			System.out.println(i);
		}

		for (Person a : person)
			if (a.name == "Amrit Parajuli") {
				System.out.println("Their name is " + a.name + ". " + "Their age is " + a.age + "years old. "
						+ "And the job title is " + a.jobTitle + ". ");
			}

	}

}
