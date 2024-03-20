//Practical05
//Abstraction
package Abtraction;

public abstract class Animal {
		 Animal(){
			  System.out.println("Animals eat grass"); 
		   }
		   abstract void Sound();
		   void ChangeSound() {
			   System.out.println("But tiger eat meat");
		   }
		}
		class Tiger extends Animal{
			void Sound() {
				System.out.println("The Sound of tiger is like roaring");
				}
		}
		class AbtractClass{
			public static void main(String[] args) {
				Animal t= new Tiger();
				t.Sound();
				t.ChangeSound();
				
			}
		}

