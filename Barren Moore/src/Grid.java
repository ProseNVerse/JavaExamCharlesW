import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Grid {
	
	private static boolean Treasure = false;
	private static boolean TreasureLoc = false;
	private static String answer = "";
	private static boolean Found = false;
	private static String input = "";
	private static Scanner keyboard = new Scanner(System.in);
	private int xLocation;
	private int yLocation;
	int [] array1 = {0,1,2,3,4,5,6,7,8,9};
	int [] array2 = {0,1,2,3,4,5,6,7,8,9};
	int A2= array1.length;
	int B2 = array2.length;
	int player;
	

	public void Grid1 (int A, int B){
		
		int i;
		int a = 2;
		int b = 0;
		
		//Starting Coordinates would be (0,0)
		//Go North (A, B + 1)
		//Go East (A + 1, B)
		//Go South (A, B - 1)
		//Go West (A - 1, B)
		//For now, treasure will be at (5,5) for testing purposes
		//Expected outcomes from compass will be 8.4
		//Remember to float the variable for the outcome
	}
	public void East(int A, int B) {
		
		if (A>=0 & A<9) {
				A=A+1;
			/*System.out.println(A + "," + B);*/
	
		}
		
	}
	
	public void West(int A, int B) {
		
		if (A>0) {
			A=A-1;
			/*System.out.println(A + "," + B);*/
		}else{
		
		}
			
	}
	public void North(int A, int B) {
		
		if(B>=0 & B<9) {
			B=B+1;
			/*System.out.println(A + "," + B);*/
		}else {
			
		}
	}
	public void South(int A, int B) {
		
		if (B>0) {
			B=B-1;
			/*System.out.println(A + "," + B);*/
			}else {
			
		}
	}
		
	
		
	
	
	public void Compass() {
		
	}
	
}
