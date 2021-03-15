import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your student ID: ");
        String userID = scan.nextLine();
        if(userID.length() == 7){
            System.out.println("Quinnnipiac Student ID Number: " + userID);
        } else {
            System.out.println("Sorry, you are not a Quinnipiac Student. \nPlease try again later when you are enrolled!");
        }
    }
}
