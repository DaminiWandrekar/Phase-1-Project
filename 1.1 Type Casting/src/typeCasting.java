
public class typeCasting {

	public static void main(String[] args) {
		
		System.out.println("Implicit Type Casting");
		
		byte a = 40;
		short b = a;
	    int  c = b;
	    float d = c;
	    double e = d;
	    System.out.println("byte value : "+a);
	    System.out.println("short value : "+b);
	    System.out.println("int value : "+c);
	    System.out.println("float value : "+d);
	    System.out.println("double value : "+e);
	    
	    System.out.println("\n");
		System.out.println("Explicit Type Casting");

		double f = 85.0;
		int g = (int) f;
		byte h = (byte) g;
		System.out.println("double value : "+f);
		System.out.println("int value : "+g);
		System.out.println("byte value : "+h);

	}

}
