package L2;

class Human {
	String name;
	int age;
	
	
	
	void sayIntro() {
		System.out.println("Hello, my name is " + name + "  and my age is " + age + "!");
	}
	
	void subtract() {
		int age1 = age - 10;
		System.out.println("My age 10 years before was: " + age1 + ".");
		
	}
}

	public class Methods {
/* methods = action/behavior
 *Using methods we can enable an object to do something
 *For example, we can enable the class Person to have a certain behavior
 *One behavior we could do is having person1 say their name and age
 *We can create a method inside class Person
 *Also, you can out anything you want inside a method
 *Such as loops, prints, etc.
  
*/

	public static void main(String[] args) {
		Human person1 = new Human();
		person1.name = "John Adams";
		person1.age = 19;
		person1.sayIntro();
		person1.subtract();
		
		
		/* in order to make the method: "speak"
		 * I need to call the method in the Main method
		 * 
		*/
	}

}
