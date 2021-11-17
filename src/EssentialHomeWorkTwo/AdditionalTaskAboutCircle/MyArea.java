package EssentialHomeWorkTwo.AdditionalTaskAboutCircle;

public class MyArea {
    public static final double PI = 3.14;

    public static double areaOfCircle(double radius) {
        return PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        System.out.printf("The area of the circle with radius %.2f is %.2f", 20.0, areaOfCircle(20));
    }
}
