package EssentialHomeWorkOne.Task1;

import java.util.Scanner;

public class Rectangle {
    public double sideOneRectangle;
    public double sideTwoRectangle;
    public Scanner input = new Scanner(System.in);

    public double areaCalculator(double sideOneRectangle, double sideTwoRectangle) {
        return sideOneRectangle * sideTwoRectangle;
    }

    public double perimetrCalculator(double sideOneRectangle, double sideTwoRectangle) {
        return (sideOneRectangle + sideTwoRectangle) * 2;
    }

    public void main(String[] args) {
        System.out.println("Enter size of the first side");
        sideOneRectangle = input.nextDouble();
        System.out.println("Enter size of the second side");
        sideTwoRectangle = input.nextDouble();
        System.out.printf("Area of the rectangle is %.2f", areaCalculator(sideOneRectangle, sideTwoRectangle));
        System.out.printf("\nPerimetr of the rectangle is %.2f", perimetrCalculator(sideOneRectangle, sideTwoRectangle));
    }
}
