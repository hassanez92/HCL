
public class Vehicle {

	public void printDetails() {}
	public void calculateValue() {}
	public void addVehicletoDB() {}
	
}

//Open-Closed Principle(OCP)
/*
 * Open for enhancements and closed for modification
 */
//Liskov substitution principle
//IS A -> derived classes must be completely substitutable for the base classes

 class Rectangle{
	private double width;
	private double height;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
		
}
 class Square extends Rectangle {
	 
	 }
 
 //Interface segregation principle
 interface Vehicle{
	 public void speed();
	 public void run();	 
 }
 
 class Car implements Vehicle{
	 
 }