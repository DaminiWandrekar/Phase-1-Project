import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
	      {
	    	  String YN;
	    	  do
	    	  {
	    		  Scanner s = new Scanner(System.in);
	    	      System.out.print("\nEnter First numbers: ");
	    	      int no1= s.nextInt();
	    	      System.out.print("Enter Two numbers:");
	    	      int no2= s.nextInt();
	    	      System.out.print("Enter an operator (+, -, *, /):");
	    	      String sym= s.next();
	    	      int res;
	      switch(sym) {
	         case "+": res = no1 + no2;
	            break;
	         case "-": res = no1 - no2;
	            break;
	         case "*": res = no1 * no2;
	            break;
	         case "/": res = no1 / no2;
	            break;
	      default: System.out.printf("Error! Enter correct operator");
	        return;
	      }
	      System.out.print("The result is given as follows:");
	      System.out.printf(no1 + " " + sym + " " + no2 + " = " + res);
	      
	
	      System.out.printf("\nDo you want to continue (press Y for yes & N for no) : ");
	      YN=s.next();
	      }
	     while(YN.equals("Y")||YN.equals("Y"));
	}
	}
}
	