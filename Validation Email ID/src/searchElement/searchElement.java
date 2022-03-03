package searchElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class searchElement{
	 

	public static void main(String[] args) {
		String YN;
		int i=0;
	 do
	 {
        List<String> emails = new ArrayList<String>();  
        	// add valid email addresses
        
        emails.add("hope@gmail.co.in");  
        emails.add("emma@yahoo.com");  
        emails.add("dorian.williams@gmail.com");  
        emails.add("lizzie#@domain.co.in");  
        emails.add("josie@domain.com");  
        emails.add("alaric@gmail.com");  
        
        //Add invalid email in list  
        
        emails.add("@google.com");  
        emails.add("ruhi123#domain.com");  

        for(String value: emails)
        {
	 	System.out.println(" The Email address : " + value );
	 }
        System.out.println("\n Enter email address for check :");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
     for(String value: emails)
        {
        	   if(	input.equals(value))
        	   {
        	        System.out.println("The Email address ( " + input + " ) is - " +(isValidEmail(input) ? "valid" : "invalid"));
        	        break;
        	   }
        	   if(i++ == emails.size() - 1){
          System.out.println("Email id not found");
                                          }
        	
	    }


       
        
        System.out.printf("\n Do you want to continue (press Y for YES & N for NO) : ");
	     
		YN=sc.next();
}while(YN.equals("Y")||YN.equals("y"));
	}
	
	public static boolean isValidEmail(String email) {
		 String regex = "^(.+)@(.+)$";
		 //initialize the Pattern object
		  Pattern pattern = Pattern.compile(regex);
 		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
}

}

		