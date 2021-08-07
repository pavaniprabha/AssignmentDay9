

import java.util.Scanner;

 public class AddressDetails {
	 public static int row=1,column=8;
	    public static String [][] addArray = new String[row][column];
	    public static String[] index = {"First Name","Last Name","Address","City","State","Zip Code","Mobile Number","Email ID"};
	    public static Scanner sc = new Scanner(System.in);
	    public static void main(String[] args) {
	        AddressDetails obj = new AddressDetails();
	    	  obj.Input();
	          DisplayElements();
	      
	    }

	    public void Input(){
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < column; j++) {
	                System.out.print("Enter your " + index[j] + " : ");
	                addArray[i][j]=sc.nextLine();
	            }
	        }
	    }

	    public static void DisplayElements(){
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < column; j++) {
	                System.out.print(addArray[i][j]+" ");
	            }
	          
	        }
	    }
}
