package project1CS351;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class ContactList {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
    	String personalContactFile ="personalContacts1.txt";
        String personalContactfile = "personalContacts";
       
        
        try (BufferedReader reader = new BufferedReader(new FileReader(personalContactFile))) {
            String line;
            PersonalInfo thisInfo = null;
            Address thisAddress;
            Label thisLabel = null;
            
         // Read and discard the first line
            String identifier = reader.readLine();
            while ((line = reader.readLine()) != null) {
                // Split the line by comma and trim whitespace from each field
            	
            	
	                String[] fields = line.split(",");
	                for (int i = 0; i < fields.length; i++) {
	                    fields[i] = fields[i].trim(); // Trim the field to remove leading/trailing whitespace
	                }
	                
	      
	                thisAddress = new Address(fields[4], fields[5], fields[6], Long.parseLong(fields[7]));
	                
	                
	                if(identifier.equals("P")){
	                	thisInfo = new PersonalInfo(fields[0], fields[1]);
	                	thisLabel = Label.fromString(fields[8]);
	                	PersonalContact personalContact = new PersonalContact(Long.parseLong(fields[3]),
	                			fields[2], thisAddress, thisInfo, thisLabel);
	                	
	                }else if(identifier.equals("W")){
	                	thisInfo = new PersonalInfo(fields[0], fields[1], status);
	                }
	                
	        
	               
	                System.out.println("---------------"); // Separator for visual distinction between records
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
        
        
        Scanner scan = new Scanner(System.in);
        String cl1;
        String cl2;

        System.out.println("Enter filename for contact list 1> ");
        cl1 = scan.nextLine();
        System.out.println("Enter filename for contact list 2> ");
        cl2 = scan.nextLine();

        System.out.println("Welcome to database display");
        int choice;
        do {
            System.out.println("\nPlease make choice");
            System.out.println("        0) Quit");
            System.out.println("        1) Intersect");
            System.out.println("        2) Difference");
            System.out.println("        3) Union");
            System.out.println("        4) Select");
            System.out.println("        5) Remove");
            System.out.println("        6) Print both tables");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
            choice = scan.nextInt();
            
            
            
        } while (choice != 0);
        
        //WorkContact myWorkaccount = new WorkContact();
    }
}
