public class CircleDriver {
    public static void main(String[] args) {
        Circle circle1 = new Circle(15.7, "red");

        System.out.println(circle1);

        System.out.println("Площадь круга: " + circle1.area());

        System.out.println("Периметр круга: " + circle1.perimeter());
    }
}
