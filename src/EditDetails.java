import java.util.Objects;
import java.util.Scanner;

public class EditDetails {
	    public static String details;
	    public static int row=2,column=8;
	    public static String[] index = {"First Name","Last Name","Address","City","State","Zip Code","Mobile Number","Email ID"};
	    public static Scanner sc = new Scanner(System.in);
	    public static void main(String[] args) {
	    	
	        System.out.print("Enter How many person details you want to add in addressbook : ");
	        row = sc.nextInt();
	        String [][] addArray = new String[row][column];
	        Input(addArray );
	        Edit(addArray );
	        DisplayElements(addArray );
	       
	    }

	    public static void Input(String[][] addArray){
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < column; j++) {
	                System.out.print("Enter your " + index[j] + " : ");
	                addArray[i][j]=sc.next();
	            }
	       
	        }

	    }


	    public static void Edit(String[][] addArray){
	        System.out.println("Enter contacts to Edit Details : ");
	        details = sc.next();
	        int i = 0;
	        while (!Objects.equals(addArray[i][0], details)){
	            i++;
	        }
	        System.out.println("Enter details to change :");
	        System.out.println("0.First Name, 1.Last Name, 2.Address, 3.City, 4.State, 5.Zip Code, 6.Mobile Number, 7.Email ID");
	        int j = sc.nextInt();
	        System.out.println("Enter New "+ index[j]+ ": ");
	        addArray[i][j]=sc.next();
	    }
	    

	    public static void DisplayElements(String[][] addArray){
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < column; j++) {
	                System.out.print(addArray[i][j]+" \n");
	            }
	        }
	    }
}