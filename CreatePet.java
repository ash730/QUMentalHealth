import java.util.Scanner;


public class CreatePet {

	public static void main(String[] args) {

		//Jack
		System.out.println("Hello! Welcome to the create pet activity! Choose from one of the three options for creating a new furry friend.");
		System.out.println("Type in 1 to choose a dog. Type in 2 to choose a guinea pig. Type in 3 to choose a cat.");
		
		Scanner myScanner1 = new Scanner(System.in);
		int userChoice = myScanner1.nextInt();
		
		if(userChoice == 1) {
			
			System.out.println("Thank you for choosing me! What would you like my name to be?");
			String dogName = myScanner1.nextLine();
			
			//System.out.println("Thanks, that's much better. Now that I know that my name is " + dogName + ", what breed of dog shall I be?");
			String dogBreed = myScanner1.nextLine();
			
			System.out.println("Hurray! I am " + dogBreed + ", and you are my new bestfriend! May we go on a walk? *Y for yes, N for no* ");
			String goOnWalk = myScanner1.nextLine();
			
			if(goOnWalk.equals("Y")) {
				
				System.out.println("Ruff Ruff, thank you! *Wags tail profusely* ");
			}
			
			else {
				
				System.out.println("*Growls profusely and then goes to the bathroom on the floor in front of you* ");
			}
		}
	
		else if(userChoice == 2) {
			
			Scanner myScanner2 = new Scanner(System.in);
			
			System.out.println("Hello large human user. My name is Bertrum and I am your new guinea pig! Please feed me I am starving! *Y for yes, N for no* ");
			String gotfed = myScanner2.nextLine();
			
			if(gotfed.equals("Y")) {
				
				System.out.println("YUM! Thank you user! Without you here I would have died a miserable death.");
			}
			
			else {
				
				System.out.println("You forgot to feed me!!!!! Goodbye forever new friend...");
				
				System.exit(0);
			}
		}
		
		else {
			
			Scanner myScanner3 = new Scanner(System.in);
			
			System.out.println("Meow! I am a grumpy cat named Trevor. You can change my mood to happy if you type in *Happy*. If you type in *Mad* I will be even more grumpy!");
			String catMood = myScanner3.nextLine();
			
			if(catMood.equals("Happy")) {
				
				System.out.println("Purrrrrr I am a happy Trevor. I will now rub against your leg.");
			}
			
			else {
				
				System.out.println("Rawrrrr you are a terrible owner. *Claws users in the face ferociously*");
				
				System.exit(0);
			}
			
		}

	}

}
