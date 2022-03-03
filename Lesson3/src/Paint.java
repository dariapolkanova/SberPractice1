public class Paint {
    public static void main(String[] args) {
        Figure circle = new Circle(new Point(1, 1), 5);
        Figure rectangle = new Rectangle(new Point(1, 1), 10, 5);
        Figure square = new Square(new Point(1, 1), 4);
        Figure triangle = new Triangle(new Point(1, 1), 3, 4, 5);

        FigureUtil.area(circle);
        FigureUtil.area(rectangle);
        FigureUtil.area(square);
        FigureUtil.area(triangle);

        FigureUtil.perimeter(circle);
        FigureUtil.perimeter(rectangle);
        FigureUtil.perimeter(square);
        FigureUtil.perimeter(triangle);

        FigureUtil.draw(circle);
        FigureUtil.draw(rectangle);
        FigureUtil.draw(square);
        FigureUtil.draw(triangle);

        FigureUtil.draw(circle, Color.GREEN);
        FigureUtil.draw(rectangle, Color.BLUE);
        FigureUtil.draw(square, Color.ORANGE);
        FigureUtil.draw(triangle, Color.RED);
    }
}
