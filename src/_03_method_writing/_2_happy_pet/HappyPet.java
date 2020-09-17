package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: 
	static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
			String pet = JOptionPane.showInputDialog("What kind of pet would you like to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int i = 0; i < 6; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you like to do with your " + pet + "?", "Action", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Play", "Walk", "Clean" }, null);
			
			// 5. Use user input to call the appropriate method created in step 4.
			
				if(task == 0) {
					play();
				}
				else if(task == 1) {
					walk();
				}
				else if(task == 2) {
					clean();
				}
			
				if(happinessLevel == 6) {
					JOptionPane.showMessageDialog(null, "It seems your pet has reached the maximum happiness level.\nYou love your pet so much!");
					break;
				}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	public static void play() {
		happinessLevel++;
		happinessLevel++;
		System.out.println("You played with your pet! Its happiness is now at " + happinessLevel);
	}
	public static void walk() {
		happinessLevel++;
		System.out.println("You took your pet on a walk! Its happiness is now at " + happinessLevel);
	}
	public static void clean() {
		happinessLevel++;
		System.out.println("You cleaned your pet! Its happiness is now at " + happinessLevel);
	}	
}