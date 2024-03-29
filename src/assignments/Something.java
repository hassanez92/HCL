package assignments;

public class Something {

 
    public static void main(String[] args) { 
        FirstClass objA = new FirstClass(); 
        SecondClass objB = new SecondClass(); 
        System.out.println("in main(): "); 
        System.out.println("objA.a = "+objA.getFirstClass()); 
        System.out.println("objB.b = "+objB.getSecondClass()); 
        objA.setFirstClass (222); 
        objB.setSecondClass (333.33); 
        System.out.println("objA.a = "+objA.getFirstClass()); 
        System.out.println("objB.b = "+objB.getSecondClass()); 
    } 
} 
 
 
 class FirstClass { 
    int a = 100; 
    public FirstClass () { 
        System.out.println("in the constructor of class FirstClass: "); 
        System.out.println("a = "+a); 
        a = 333; 
        System.out.println("a = "+a); 
    } 
    public void setFirstClass( int value) { 
        a = value; 
    } 
    public int getFirstClass() { 
        return a; 
    } 
} //class FirstClass 
 
class SecondClass { 
	    double b = 123.45; 
	    public SecondClass() { 
	        System.out.println("-----in the constructor of class B: "); 
	        System.out.println("b = "+b); 
	        b = 3.14159; 
	        System.out.println("b = "+b); 
	    } 
	    public void setSecondClass( double value) { 
	        b = value; 
	    } 
	    public double getSecondClass() { 
	        return b; 
	    } 
	} //class SecondClass 

/*
 *****OUTPUT*****
 * 
 * in the constructor of class FirstClass: 
a = 100
a = 333
-----in the constructor of class B: 
b = 123.45
b = 3.14159
in main(): 
objA.a = 333
objB.b = 3.14159
objA.a = 222
objB.b = 333.33
 */ 
