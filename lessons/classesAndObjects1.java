package L2;

/* A class is a blueprint/template for creating objects.
 * In the real world, almost everything is an object. 
 For example, you are an object, you computer is an
 object, your cat is an object, etc. 
 * In a class everything that you create is an object.
 * You also need a way to specify the different objects
 in your program, so a class does that job. For example
 a person class could be used to create person objects
 that would be represent particular people.
 * The person class does not symbolize a person
 but rather the idea of a person.
 * Classes can contain:
 * 1. Data(represents state of objects using
 instance variables)
 * 2. Subroutines(methods)
 * */
class Person {
	// Instance variables(data or "state")
	String name;
	int age;

}

public class ClassesAndObjects1 {
//accessing variables i n class Person using a dot and name of variable
	public static void main(String[] args) {
		// subroutine
		// Below are the objects/particular people:
		Person person1 = new Person();// delcaring a variable of type: Person[person object]
		person1.name = "Sara Pines";// giving person1 data
		person1.age = 25;
		System.out.println("Hello, my name is " + person1.name + " and I am " + person1.age + "!");

		Person person2 = new Person();
		person2.name = "Samuel Niles";
		person2.age = 14;
		System.out.println("Hello, my name is " + person2.name + " and I am " + person2.age + "!");

	}

}
