import java.util.Scanner;

public class PainfullyEasyQuiz {

    public PainfullyEasyQuiz() {
        Scanner in = new Scanner(System.in);
        boolean problemCompleted = false;
        System.out.println("Welcome to this super easy quiz! Let's get started.");
        System.out.println("Question 1: What is the last letter of the alphabet?");
        do {
            if (in.nextLine().toLowerCase() == "z") {
                problemCompleted = true;
            }else System.out.println("Not quite! Try again.");
        } while (!problemCompleted);
        problemCompleted = false;
        System.out.println("Question 2: What is 2+2?");
        do {
            if (in.nextLine() == "4") {
                problemCompleted = true;
            }else System.out.println("Not quite! Try again.");
        } while (!problemCompleted);
        problemCompleted = false;
        System.out.println("Question 3: Who was the first president of the United States?");
        do {
            if (in.nextLine().toLowerCase() == "george washington") {
                problemCompleted = true;
            }else System.out.println("Not quite! Try again.");
        } while (!problemCompleted);
        problemCompleted = false;
        System.out.println("Question 4: What color is an orange?");
        do {
            if (in.nextLine().toLowerCase() == "orange") {
                problemCompleted = true;
            }else System.out.println("Not quite! Try again.");
        } while (!problemCompleted);
        problemCompleted = false;
        System.out.println("Last one! Question 5: Fill in the blank: We attend __________ University.");
        do {
            if (in.nextLine().toLowerCase() == "quinnipiac") {
                problemCompleted = true;
            }else System.out.println("Not quite! Try again.");
        } while (!problemCompleted);
        System.out.println("Great work! Thanks for playing the quiz!");
    }
}
