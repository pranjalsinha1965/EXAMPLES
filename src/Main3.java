public class Main3 extends Triangle{

    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1, 1); // Creating a circle with radius 5
        double area = triangle.area();
        double perimeter = triangle.perimeter();

        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}