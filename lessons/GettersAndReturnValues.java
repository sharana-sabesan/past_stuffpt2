package L2;

class Persun {
	String name;
	int age;
	int retiredAge;
	
	/*Void means that this method does not return anything
	 * But if you want to return something, get rid of void
	 * and then add int or whatever data type you want to return
	 * Finally at the very bottom of the method, add:
	 * return "whatever variable"
	 */
	void speak() {
		System.out.println("My name is " + name + " and my age is " + age + "!");
		
	}
	//You want to use methods to retrieve data or calculate something
	int calculateYearsToRetirement() {
		int yearsLeft = retiredAge - age;
		//65 is the age they will retire
		return yearsLeft;
		//What this method is doing is returning the value: yearsLeft
	}
//getter methods return values as well and "get them" in another method.
	int getAge() {
		return age;
		
	}
	 String getName() {
		 return name;
	 }
}

public class GettersAndReturnValues {
	public static void main(String[] args) {
		Persun person1 = new Persun();
		person1.name = "Alisha Carey";
		person1.age = 30;
		person1.retiredAge = 89;
		//person1.speak();
		int years = person1.calculateYearsToRetirement();
		System.out.println("I will retire after: " + years + " years.");
		//We are setting a random variable equal to the return value of the
		//method: calculateYearsToRetirement
		//person1.calculateYearsToRetirement = yearsLeft
		//You can also return arrays
		int age = person1.getAge();
		String name = person1.getName();
		
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}
}

