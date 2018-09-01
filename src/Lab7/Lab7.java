/**
 * Created by JoRanda Chapman
 * Grand Circus Lab 7 
 * Date: 07/23/2018 
 *
 */
package Lab7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab7 {

    Scanner scnr = new Scanner(System.in);
	
	public static void main( String[] args )  {
		
		//Scanner created for User Input  
		Scanner scnr = new Scanner(System.in);
		System.out.println("To subscribe to our newletter, please fill out your contact information."); 
		
		System.out.println("Enter A Valid Name");
		String NameInput = scnr.next();
		System.out.println(validateFirstName(NameInput));
		
		System.out.println("Enter A Valid Email");
		String EmailInput = scnr.next();
		System.out.println(validateEmail(EmailInput));
		
		System.out.println("Enter A Valid Phone");
		String PhoneInput = scnr.next();
		System.out.println(validatePhone(PhoneInput));
		
		System.out.println("Enter A Valid Date");
		String DateInput = scnr.next();
		System.out.println(validateDate(DateInput));
		
		scnr.close();
	   
	}
	  //Method to validate name only have alphabets, start with capital letter
	   public static String validateFirstName( String name )
	   {     
		   Pattern p = Pattern.compile("^[A-Z][a-z]{0,29}$");
		   Matcher m = p.matcher(name);
		   
		 //If regex pattern is found, a validation message is returned
		   if (m.matches()) {
				return "Name is valid!";
			} 
		   
		 //If pattern is not found, a failure to validate message is returned
		   else {
					return "Error! Please enter valid name.";
					
			}
		
		}
	   
	   public static String validateEmail(String email) {
			
			Pattern p = Pattern.compile("[A-Z0-9]{5,30}@[A-Z0-9]{5,10}[.][A-Z0-9]{2,3}");
			Matcher m = p.matcher(email);
		
			
			//If regex pattern is found, a validation message is returned
			if (m.find()) {
				return "Email is valid!";
			}
			
			//If pattern is not found, a failure to validate message is returned
			else {
				return "Error! Please enter a valid email address";
			}
		}
	   
	  //Write a method that will validate phone numbers. Format should be {area code of 3 digits} - {3 digits} - {4 digits}
	   public static String validatePhone( String phone) {
	   
	   Pattern p = Pattern.compile("[0-9]{3}\\\\-[0-9]{3}\\\\-[0-9]{4}" );
	   Matcher m = p.matcher(phone);
       
	   
	    //If regex pattern is found, a validation message is returned
		if (m.find()) {
			return "Phone Number is Valid!";
		}
		
		//If pattern is not found, a failure to validate message is returned
		else {
			return "Error! Phone number is not valid!";
		}
	}
	 
	   //Write a method that will validate DATE based on the following format (dd/mm/yyyy)
	   public static String validateDate( String date)  {
		   
		   Pattern p = Pattern.compile("[0-9]{3}\\\\-[0-9]{3}\\\\-[0-9]{4}" );
		   Matcher m = p.matcher(date);
		
		   
		   if (m.find()) {
				return "Date is Valid!";
			}
			
			//If pattern is not found, a failure to validate message is returned
			else {
				return "Error! The Date entered is not valid!";
			}
	    
	   }
}

