public class Main extends Circle {
        public static void main(String[] args) {
            Circle circle = new Circle(5); // Creating a circle with radius 5
            double area = circle.area();
            double perimeter = circle.perimeter();
    
            System.out.println("Circle Area: " + area);
            System.out.println("Circle Perimeter: " + perimeter);
        }
    }
