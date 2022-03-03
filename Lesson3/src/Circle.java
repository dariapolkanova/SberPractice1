public class Circle extends Figure implements Drawable {
    private int radius;

    public Circle (Point point, int radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        draw(Color.BLACK);
    }

    @Override
    public void draw(Color color) {
        System.out.printf("Круг с координатой %s, радиусом %s и с цветом %s%n", point, radius, color);
    }

}
