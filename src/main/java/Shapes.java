import java.util.Scanner;

public class Shapes {

    /**
     * Runs the ShapeMaker program
     */
    public static void Run() {
        // Get desired length and height from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length: ");
        int length = scanner.nextInt();
        System.out.print("Enter a height: ");
        int height = scanner.nextInt();

        // Print shapes
        System.out.println("Square:");
        System.out.println(ShapeMaker.PrintSquare(length));

        System.out.println("Rectangle:");
        System.out.println(ShapeMaker.PrintRectangle(length, height));

        System.out.println("Right Triangle:");
        System.out.println(ShapeMaker.PrintRightTriangle(height));

        System.out.println("Inverted Right Triangle:");
        System.out.println(ShapeMaker.PrintInvertedRightTriangle(height));
    }
}