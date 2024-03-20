//Practical03
//Final class
package Final_keyword;

final public class FinalcClass {//final class
	//class Software extends FinalcClass{
	public static void main(String[] args) {
		//void run() {
			System.out.println("Software running safely with high performance");
		}
 
		//public static void main(String[] args) {
			//Software s1=new Software();
			//s1.run();
		//}
	}
	//Final method
package Final_keyword;

public class FinalMethod {
	final void output() {//method
		System.out.println("This is the method using Fianl keyword");
	}
}
class Search extends FinalMethod{
	//void output(){
	//System.out.println("Search");
	//}
	public static void main(String[] args) {
		Search s=new Search();
		s.output();
	}
}	
//final variable
package Final_keyword;

public class Finalvariable {
	final int speed=250;//variable
	void show() {
		System.out.println("speed limit of car is :"+speed);
	}
	// speed=300;
	//System.out.println(speed);
	public static void main(String[] args) {
		Finalvariable a=new Finalvariable();
		a.show();
	}

}
