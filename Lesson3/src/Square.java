public class Square extends Figure implements Drawable{
    private int a;

    public Square(Point point, int a) {
        super(point);
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public double perimeter() {
        return 4 * a;
    }

    @Override
    public void draw() {
        draw(Color.BLACK);
    }

    @Override
    public void draw(Color color) {
        System.out.printf("Квадрат с координатой %s, стороной %s и с цветом %s%n", point, a, color);
    }

}
