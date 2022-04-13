package shapes;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void showFigureInfo() {
        System.out.println(String.format("Circle(%d);", radius));
    }
}
