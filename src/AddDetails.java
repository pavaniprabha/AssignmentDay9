import java.util.Scanner;

public class AddDetails {

	    public static int row=2,column=8;
 
	    static String [][] addArray = new String[row][column];
	   
	    public static String[] index = {"First Name","Last Name","Address","City","State","Zip Code","Mobile Number","Email ID"};
	    public static Scanner sc = new Scanner(System.in);
	    public static void main(String[] args) {
	        System.out.print("Enter person details you want to add in addressbook : ");
	        row = sc.nextInt();
	        System.out.println();
	        Input(addArray);
	        DisplayElements(addArray);
	      
	    }


	    public  static void Input(String[][] addArray){
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
	                System.out.print(addArray[i][j]+ "\n");
	            }
	            System.out.println();

	        }
	    }
}
