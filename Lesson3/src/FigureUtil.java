public class FigureUtil {
    private FigureUtil(Figure figure) {}

    public static double area(Figure figure) {
        return figure.area();
    }

    public static double perimeter(Figure figure) {
        return figure.perimeter();
    }

    public static void draw(Drawable figure) {
        draw(figure, Color.BLACK);
    }

    public static void draw(Drawable figure, Color color) {
        figure.draw(color);
    }
}
