import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Narration {
	
	private static boolean Treasure = false;
	private static String answer = "";
	private static String input = "";
	private static Scanner keyboard = new Scanner(System.in);
	

public void Narration() {
		System.out.println("You awake to a sharp pain! \n"
				+ "You sit bolt upright smacking your head on something hard, dazing yourself slightly. In an attempt to understand your surroundings better, you try and feel out your surroundings."
				+ " \nYour hands touch the ground you are on and begin to search."
				+ " The ground feel soft and wet. Upon further exploration, your hands brush against small patches of grass and dip into pools of frigid water."
				+"\nHaving explored the ground, you reach up and find the object you hit your head on."
				+ "\nYou find the object with your hands and begin to feel it. It's cold and solid, almost rock-like in its texture. You can't quite figure out what it is through touch alone."
				+"\nWould you like to open your eyes: (y/n)");
		
		input = keyboard.nextLine();
		answer = input;
		
		switch(answer) {
		case "n":
			System.out.println("\n... Wow... really? Okay, fine. You keep your eyes firmly shut because the world is scary and you want nothing to do with it. You get off your lazy butt and "
					+ "stumble around for a bit before tripping,\n"
					+ " falling down, and knocking yourself unconscious"
					+ "with your own wildly flailing arms.\n" +
		"You die from dehydration, starvation, and sheer stupidity. Congratulations.\n ---------GAME OVER---------");
			break;
		case "y":
			System.out.println("\nYou open your eyes to see a small wooden sign. Not rock. Wood. You really should work on your detective skills there, Sherlock."
					+ "\nLooking around, you find that you are in the middle of an enormous moor or bog. It seems to stretch on for miles in any direction and you start to wonder why you are here."
					+ "\nInspecting yourself, you notice a small, watch-like apparatus on your left arm. Upon further inspection you find it to be some kind of a compass with a set of coordiates written on it, though spinning wildly in a circle."
					+ "\nHaving exhausted all possible ideas in your tiny head the only left to do is for me to ask you want to read the sign in front of you that you seem to have forgotten about, because apparently"
					+ "as an omniscient being\nI have all the time in the world.\n" + "So, would you like to read the sign? (y/n)");
		
		input = keyboard.nextLine();
		answer = input;
		
		switch(answer) {
		case "y":
			System.out.println("\nThe sign reads as follows:");
			System.out.println("'This is the Boolean Bog. Beware all ye who enter here!'");
			System.out.println("'If ye seek the treasure hidden within, follow the compass. Thouest can now begin!'\n"
					+ "(Directions possible: East, North)");
			break;
		case "Y":
			System.out.println("\nThe sign reads as follows:");
			System.out.println("'This is the Boolean Bog. Beware all ye who enter here!'");
			System.out.println("'If ye seek the treasure hidden within, follow the compass. Thouest can now begin!'\n"
					+ "(Directions possible: East, North)");
			break;
		case "n":
			System.out.println("Well, no one ever said I wasn't extremely petty. Congratulations!\n"
					+ "---------------YOU DIED--------------");
			break;
		case "N":
			System.out.println("Well, no one ever said I wasn't extremely petty. Congratulations!\n"
					+ "---------------YOU DIED--------------");
			break;
		}
		
	
	}

}
}
