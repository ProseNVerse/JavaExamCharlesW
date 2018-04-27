import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class Main {
		
	static boolean Treasure = false;
	private static String answer = "";
	private static String input = "";
	private static Scanner keyboard = new Scanner(System.in);
	static int C = (int)(Math.random()*9);
	static int D = (int)(Math.random()*9);
	static String Treas = (C + ", "+ D);
	int A = 0;
	int B = 0;

	public static void main(String[] args) {
		

		int A, B;
		int Com;
		int Com2;
		int Com3;
		int Com4;
		int Com5;
		int ComRes;
		A=0;
		B=0;
		
		
		Grid Y = new Grid();
		TheEnd G = new TheEnd();
		Narration N = new Narration();
	

	

			
		System.out.println("WELCOME TO THE BOOLEAN BOG! A NEW TEXT BASED ADVENTURE GAME WHERE " + "YOU FIND A FANTASTIC TREASURE AND WIN THE GAME!\nOr you die horribly in many painful ways.");
		System.out.println("Would you like to begin? (y/n)");
			input = keyboard.nextLine();
			answer = input;
			switch(answer) {
			case "n":
				System.out.println("Alright, bye\n----------------YOU DIED----------------");
				break;
			case "N":
				System.out.println("Alright, bye\n----------------YOU DIED----------------");
				break;
				
			case "y":
				System.out.println("\n");
				N.Narration();
				break;
				
			case "Y":
				System.out.println("\n");
				N.Narration();
				break;
				
			case "G":
				G.EndingsAreHard();
				break;
				
			case "g":
				G.EndingsAreHard();
				break;
			}			
			
			
			while (Treasure == false) {
				System.out.println("Get to the coordinates: " + Treas + ". You are at ("+A+","+B+")\n");
				Com = (C - A); 
				Com2 = (D - B);
				Com3 = (Com2*Com2);
				Com4 = (Com * Com);
				Com5 = (Com3+Com4);
				ComRes = (int)(Math.sqrt(Com5));
			System.out.println("What direction would you like to go?\n");
			System.out.println("You are " + ComRes + " away");
			input = keyboard.nextLine();
			answer = input;
			switch(answer) {
			case "East":
				Y.East(A, B);
				if (A>=0 & A<9) {
				A=A+1;
				System.out.println(A + ", " + B);
				}else {
					System.out.println("After much wondering, you find you are back where you started");
				}break;
			case "West":
				Y.West(A, B);
				if (A>0) {
				A=A-1;
				System.out.println(A + ", " + B);
				}else {
					System.out.println("After much wondering, you find you are back where you started");
				}break;
			case "North":
				Y.North(A, B);
				if (B>=0 & B<9) {
				B=B+1;
				System.out.println(A + ", " + B);
				}else {
					System.out.println("After much wondering, you find you are back where you started");
				}break;
			case "South":
				Y.South(A, B);
				if (B>0) {
				B=B-1;
				System.out.println(A + ", " + B);
				}else {
					System.out.println("After much wondering, you find you are back where you started");
				}break;
				
			
			}if (A == C & B == D) {
				Treasure = true;
				
			}
			if (Treasure == true) {
				G.EndingsAreHard();
			}
		
		}
	}
}


	

	


