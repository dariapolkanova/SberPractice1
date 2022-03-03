public class Triangle extends Figure implements Drawable{
    private int a;
    private int b;
    private int c;

    public Triangle(Point point, int a, int b, int c) {
        super(point);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        int p = a + b + c;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public void draw() {
        draw(Color.BLACK);
    }

    @Override
    public void draw(Color color) {
        System.out.printf("Треугольник с координатой %s, сторонами %s, %s, %s и с цветом %s%n", point, a, b, c, color);
    }
}
