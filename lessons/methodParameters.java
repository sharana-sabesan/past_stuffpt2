package L2;
/*you can return values from methods 
 *and pass values into methods
 *The 2 round brackets "()", used when creating or
 *calling a method, are like a chute that you throw data down
 *When you calling the method: it is the top of the chute
 *when you create the method: it is the bottom of the chute
 *IN the example below we are passing a parameter to the method: speak
 *A parameter is a variable you pass into a method
 *You can change or tweak a parameter, for example I can change the text 
 *in the brackets when I call method: speak
 *A method parameter changes the way the method works
 *All in all, we are putting a value/variable inside those brackets, and then
 *in the main method we can decide what value we want the variable to be
 *Methods can have multiple parameters
 */
class Robot{
	void speak(String text) {
		System.out.println(text);
	}
	
	void dance(int moves) {
		System.out.println("I will dance: ");
		System.out.println("-"+ moves + " moves." );
	}
	
	void movement(String dir,double distance) {
		System.out.println("-" + dir);
		System.out.println("-" + distance + " inches!");
	}
}
public class MethodParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot1 = new Robot();//object
		robot1.speak("Hi, I am Peno: the dancing robot");//calling speak method
		robot1.dance(5);
		robot1.movement("East/Left",5.5);
		String self = "I AM AWESOME!";
		robot1.speak(self);
		int x = 6;
		robot1.dance(x);
		/*As long you pass in a value which is the correct one, mentioned when
		 *creating the method it should work
		 */

		
	}

}
