import java.util.Scanner;
public class SafeSquareroot {
    public static void main ( String []args){
        Scanner keyboard = new Scanner(System.in);
        double x,y;
        System.out.println("Give me number, and I,ii find it's square root. ");
        System.out.print("(no negatives, please.)");
        x = keyboard.nextDouble();
        while (x < 0){
            System.out.println("I won't take the square root of a negative.");
            System.out.print("\nNew number: ");
        x = keyboard.nextDouble();

        }
        y = Math.sqrt(x);
            System.out.println("The square root of " + x + "is" + y);

    }
}
