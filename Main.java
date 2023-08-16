public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        Square square = new Square(7);
        System.out.println("Square perimeter: " + square.getPerimeter());

        Parallelogram parallelogram = new Parallelogram(2, 4);
        System.out.println("Parallelogram perimeter: " + parallelogram.getPerimeter());

        Rectangle rectangle = new Rectangle(2, 6);
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(1, 2, 3);
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
    }
}
