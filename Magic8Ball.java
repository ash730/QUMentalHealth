import java.util.Scanner;

public class Magic8Ball {

    public Magic8Ball() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the virtual Magic 8 Ball! Ask any yes/no question and it shall be answered.\n" +
                "Type \"quit\" at any time to leave.");
        boolean running = true;
        while(running) {
            if(in.nextLine().toLowerCase().equals("stop")) {
                running = false;
            } else {
                switch ((int) (10*Math.random())) {
                    case 1:
                        System.out.println("Without a doubt.");
                        break;
                    case 2:
                        System.out.println("Yes.");
                        break;
                    case 3:
                        System.out.println("Most Likely.");
                        break;
                    case 4:
                        System.out.println("Probably, if I had to guess.");
                        break;
                    case 5:
                        System.out.println("There's a chance.");
                        break;
                    case 6:
                        System.out.println("I'm not so sure.");
                        break;
                    case 7:
                        System.out.println("I wouldn't bet on it.");
                        break;
                    case 8:
                        System.out.println("No.");
                        break;
                    case 9:
                        System.out.println("Absolutely not.");
                        break;
                    default:
                        System.out.println("I'm sorry, could you ask that again?");
                        break;
                }
            }
        }
    }
}
