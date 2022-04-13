package shapes;

public class Rectangle extends Figure {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void showFigureInfo() {
        System.out.println(String.format("Rectangle(%d, %d);", width, height));
    }
}
