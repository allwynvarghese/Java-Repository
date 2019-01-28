package javaPack;

public class variablesMaster {

	public static void main(String[] args) {
		
		/*** ----------- Integer has a width of 32------------------------- ***/
		System.out.println("Integer Datatype.");
		
		int myFirstNumber = 2*(10 + 5);
		int mySecondNumber = 12;
		int my3rdNumber = 6;
		
		int myTotal = myFirstNumber + mySecondNumber + my3rdNumber;
		System.out.println("myFirstNumber: " + myFirstNumber);
		System.out.println("myTotal: "+ myTotal);
		
		/*** ------------------------------------------------------------------------ ***/
		
		/*** Byte - width 8, short - width 16 ***/
		int myIntVal = -21478562;
		int maxIntVal =  2147483647;
		System.out.println("myIntVal: "+ myIntVal+ "\nmaxIntVal: " + maxIntVal  );
		
		byte myByteValue = -128;
		byte maxByteVal = (byte)127; //Casting
		System.out.println("myByteValue: "+ myByteValue + "\nmaxByteVal: "+ maxByteVal);
		
		/*** long ***/
		long myLongVal = 50000L;
		System.out.println("myLongVal: "+ myLongVal);
		 
		/*** Short ***/
		short myShortVal = (short)500000;
		System.out.println("myShortVal: "+ myShortVal);
		
		/*** Float - width 32 (4 bytes) and Double - width 64(8 bytes) ***/
		// float - single precision with decimal point.
		// double - double precision with data type.
		
		float myFloatVal = 5.5F/2F;
		System.out.println("myFloatVal: "+ myFloatVal);
		
		double myDoubleVal = 5.256D/3D;
		System.out.println("myDoubleVal: "+ myDoubleVal);
		
		double foundPound = pounds2Kilos(20); 
		System.out.println("foundPound: "+ foundPound);
		
		/*** String ***/
		String myString = "Allwyn";
		String lastName = "Varghese";
		System.out.println(myString + lastName + " \u00A9 2018");
	}
	
	public static double pounds2Kilos(double kilos) {
		
		double pounds = kilos/0.45359237d;
		return pounds;
		
	}

}
