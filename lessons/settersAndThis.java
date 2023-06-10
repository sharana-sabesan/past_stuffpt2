package L2;

/* What we are doing below is :
 * "encapsulation" where we hide away, the kind of instance data.
 * We can also do the same thing by using private methods 
 */
class Frog {
	String name;
	int age;

	public void setName(String name) {
		this.name = name;
		/*
		 * setting value of name to another variable We use set methods when we don't
		 * want to refer to instance variables if String "newName" was actually just
		 * "name", then accessing the instance variable would be difficult, as, the
		 * method will only recognize the variable mentioned closest to it, which would
		 * be the parameter "String Name." IN order for the method to recognize, the
		 * instance variable: "name", we can put a "this." which will solve the problem.
		 */
	}

	public void setAge(int age) {

		this.age = age;
	}

	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
		/*
		 * The code written above is the exact same thing as: this.name = name this.age
		 * = age In this case, we are calling the methods to do their action which is
		 * setting/assign the instance variable value to another
		 */
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class settersAndThis {
	public static void main(String[] args) {
		Frog amph1 = new Frog();

		/*
		 * Below we are referring to instance variables
		 *  amph1.name = "Albert";
		 *   amph1.age = 12;
		 */

		amph1.setName("Benjamin");
		amph1.setAge(13);
		// Above, we are using set methods to set values to the instance variables with
		// using the instance variables in the main
		
		System.out.println("My amphibian name is: " + amph1.getName());
		System.out.println("My amphibian age is: " + amph1.getAge());

	}
}
