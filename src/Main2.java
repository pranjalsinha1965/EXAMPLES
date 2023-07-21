public class Main2 extends Circle {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5); // Creating a circle with radius 5
        double area = rectangle.area();
        double perimeter = rectangle.perimeter();

        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}
