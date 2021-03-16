import java.util.Scanner;

public class gcdCalculator {

	public static void main(String[] args) {
		//Jack
		int num1, num2;
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("Enter first number:");
        num1 = (int)myScanner.nextInt();
        
        System.out.print("Enter second number:");
        num2 = (int)myScanner.nextInt();
        
        myScanner.close();
        
        while (num1 != num2) {
        	if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        
        System.out.printf("GCD of given numbers is: %d", num2);
	}
}
