public abstract class Figure implements Drawable {
    protected Point point;

    public Figure(Point point) {
        this.point = point;
    }

    public abstract double perimeter();

    public abstract double area();
}

