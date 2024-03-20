//Practical02
//Polymorphism
package java_pakacge;

public class Bank {

	    float get_Rate_Of_Interest() {return 0;}
	    }
		class HDFC extends Bank{
		float get_Rate_Of_Interest() {return 2.5f;}
		}
		class SBI extends Bank{
		float get_Rate_Of_Interest() {return 6.5f;}
		}
		class CBI extends Bank{
	    float get_Rate_Of_Interest(){return 7.5f;}
		}
		class RBI extends Bank{
		float get_Rate_Of_Interest(){return 8.5f;}
		}
		class checkpolymorphism{
		public static void main(String args[]) {
		Bank b;
		b=new HDFC();
		System.out.println("BOB rate of interest is :"+b.get_Rate_Of_Interest());
		b=new SBI();
		System.out.println("SBI rate of interest is:"+b.get_Rate_Of_Interest());
		b=new CBI();
		System.out.println("CBI rate of interest is:"+b.get_Rate_Of_Interest());
		b=new RBI();
		System.out.println("RBI rate of interest is:"+b.get_Rate_Of_Interest());
		}
	}
//using different argument
package java_pakacge;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
    public double sub(double a,double b) {
    	return a-b;
    }
public static void main(String[] args) {
	Calculator c=new Calculator();
	int d1=c.add(22, 33);
	System.out.println("Sum of a and b is:"+d1);
	double d2=c.sub(2.5,1.5);
	System.out.println("substraction of a and b is:"+d2);
	
}
}
//Own code
/**
 * 
 */
package java_pakacge;

public class Water {
 int States() {return 0;}
}
class Solid extends Water{
	 int States() {return -10;}
}
class Liquid extends Water{
	int States() {return 35;}
}
class Gases extends Water{
	int States() {return 100;}
}
class waterTesting{
    public static void main(String[] args) {
		Water a;
		a=new Solid();
		System.out.println("The temperature of Solid state in degree celsius is:"+a.States());
		
		a=new Liquid();
		System.out.println("The temperature of Liquid state in degree celsius is:"+a.States());
		
		a=new Gases();
		System.out.println("The temperature of Gases state in degree celsius is:"+a.States());
	
	}
}

