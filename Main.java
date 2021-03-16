import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //scanner (ashley)
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your student ID: ");
        String userID = scan.nextLine();
        if(userID.length() == 7){
            System.out.println("Quinnnipiac Student ID Number: " + userID);
        } else {
            System.out.println("Sorry, you are not a Quinnipiac Student. \nPlease try again later when you are enrolled!");
            System.exit(1);
        }
        //isaac
        int overallFeeling = -1;
        do {
            System.out.println("How are you feeling overall on a scale of 1-10?");
            try {
                overallFeeling = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a number from 1-10.");
            }
        } while(overallFeeling == -1 || overallFeeling > 10 || overallFeeling < 1);
        int classesFeeling = -1;
        do {
            System.out.println("How are you feeling about your classes on a scale of 1-10?");
            try {
                classesFeeling = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a number from 1-10.");
            }
        } while(classesFeeling == -1);
        int socialFeeling = -1;
        do {
            System.out.println("How are you feeling about your social experiences on a scale of 1-10?");
            try {
                socialFeeling = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a number from 1-10.");
            }
        } while(socialFeeling == -1);

        System.out.println("Great! Now you can select from any number of games below to try and decompress.");

        while(true) {
            System.out.println("Select an activity by entering the corresponding number:");
            //insert println's for each game numbered here
            System.out.println("1. A Really Easy Quiz");
            System.out.println("2. Talk about your Favorite Color");
            System.out.println("3. Magic 8 Ball");
            System.out.println("4. Create your own Pet");
            System.out.println("5. Calculate the GCD of a Number");
            System.out.println("6. Guessing Game");
            System.out.println("7. <game>");
            System.out.println("8. <game>");
            System.out.println("9. <game>");
            System.out.println("0. Exit Application");
            switch(scan.nextLine()) {
                case "1":
                    new PainfullyEasyQuiz();
                    break;
                case "2":
                    new FavoriteColor();
                    break;
                case "3":
                    new Magic8Ball();
                    break;
                case "4":
                    new CreatePet();
                    break;
                case "5":
                    new gcdCalculator();
                    break;
                case "6":
                    new GuessingGame();
                    break;
                case "7":
                    //game
                    break;
                case "8":
                    //game
                    break;
                case "9":
                    //game
                    break;
                case "0":
                    System.out.println("Okay, see ya!");
                    System.exit(1);
                    break;
                default:
                    System.out.println("That's not one of the games. Please try again.");
            }
        }

    }
}
