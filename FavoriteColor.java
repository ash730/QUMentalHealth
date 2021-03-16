import java.util.Scanner;

public class FavoriteColor {

    public FavoriteColor() {
        Scanner in = new Scanner(System.in);
        String color;
        switch ((int) (10*Math.random())) {
            case 1:
                color = "red";
                break;
            case 2:
                color = "orange";
                break;
            case 3:
                color = "yellow";
                break;
            case 4:
                color = "green";
                break;
            case 5:
                color = "blue";
                break;
            case 6:
                color = "indigo";
                break;
            case 7:
                color = "purple";
                break;
            case 8:
                color = "brown";
                break;
            case 9:
                color = "white";
                break;
            default:
                color = "black";
                break;
        }
        System.out.println("Hey! What's your favorite color?");
        if (in.nextLine().toLowerCase().equals(color)) {
            System.out.println("Same! Why is it your favorite color?");
        } else System.out.println("That's cool! Why is that?");
        in.nextLine();
        System.out.println("Really? That's neat! Thanks for telling me!");
    }
}
