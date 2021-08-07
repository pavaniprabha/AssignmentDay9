import java.util.Objects;
import java.util.Scanner;

public class DeleteDetails {
	 public static String name;
	    public static int row=2,column=8;
	    public static String[] index = {"First Name","Last Name","Address","City","State","Zip Code","Mobile Number","Email ID"};
	    public static Scanner sc = new Scanner(System.in);
	    public static void main(String[] args) {
	    	
	        System.out.print("Enter How many person details you want to add in addressbook : ");
	        row = sc.nextInt();
	        String [][] addArray = new String[row][column];
	        Input(addArray );
	        DisplayElements(addArray);
	        Delete(addArray);
	       
	    }

		public static void Input(String[][] addArray){
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < column; j++) {
	                System.out.print("Enter your " + index[j] + " : ");
	                addArray[i][j]=sc.next();
	            }
	       
	        }

	    }


	    public static void DisplayElements(String[][] addArray){
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < column; j++) {
	                System.out.print(addArray[i][j]+" \n");
	            }
	        }
	    }
	    
        private static void Delete(String[][] addArray) {
        	   System.out.println("Enter person name to delete : ");
   	               name = sc.next();
   	               int i = 0;
   	                while (!Objects.equals(addArray[i][0], name)){
   	                  i++;
   	        }
   	             for (int j = 0; j < column; j++) {
   	              addArray[i][j]=null;
   	          }
		           System.out.println("person name is deleted");
        }
        
	    
	    
	    
	    
	    
}
