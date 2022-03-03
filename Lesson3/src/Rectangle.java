public class Rectangle extends Figure  implements Drawable {
    private int width;
    private int hight;

    public Rectangle(Point point, int width, int hight) {
        super(point);
        this.hight = hight;
        this.width = width;
    }

    @Override
    public double area() {
        return width * hight;
    }

    @Override
    public double perimeter() {
        return 2 * (width + hight);
    }

    @Override
    public void draw() {
        draw(Color.BLACK);
    }

    @Override
    public void draw(Color color) {
        System.out.printf("Прямоугольник с координатой %s, шириной %s, высотой %s и с цветом %s%n", point, width, hight, color);
    }

}
