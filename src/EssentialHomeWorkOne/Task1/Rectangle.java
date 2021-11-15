package EssentialHomeWorkOne;

import java.util.Scanner;

public class Rectangle {
    public static double side1;
    public static double side2;
    public static Scanner input = new Scanner(System.in);

    public static double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    public static double perimetrCalculator(double side1, double side2) {
        return (side1 + side2) * 2;
    }

    public static void main(String[] args) {
        System.out.println("Enter size of the first side");
        side1 = input.nextDouble();
        System.out.println("Enter size of the second side");
        side2 = input.nextDouble();
        System.out.printf("Area of the rectangle is %.2f", areaCalculator(side1, side2));
        System.out.printf("\nPerimetr of the rectangle is %.2f", perimetrCalculator(side1, side2));
    }

}
