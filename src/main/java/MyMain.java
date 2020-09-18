import java.util.Scanner;

public class MyMain {
   
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double guess = 16;
        double betterguess;
        while (Math.abs(guess*guess - x) >  0.00001){
             betterguess = (guess + x/guess) / 2;
             guess = betterguess;
        }
        System.out.println("The squareroot of your input is about "+ guess);
        return guess;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        double z = 1;
        while (!(x == 1)&&!(x == 0)){
            z = z * x;
            x = x - 1;
        }
        if (x == 0){
            return 1;
        }
        else {
            return z;
        }
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001
    // different from the value Math.E
    public static double calculateE() {
        double a = 0;
        double b = 1;
        int c = 0;
        while ((b > 0.00000000001)){
            b = 1 / factorial(c);
            a = (b) + a;
            c++;
        }
        System.out.println("The value of e is roughly: "+ c);
        return a;
    }
   
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive number!");
        double input = scan.nextDouble();
        babylonian(input);
        calculateE();

        scan.close();
    }
}