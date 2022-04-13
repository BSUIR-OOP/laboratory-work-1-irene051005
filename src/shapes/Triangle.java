package shapes;

public class Triangle extends Figure {
    private int side1, side2, side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void showFigureInfo() {
        System.out.println(String.format("Trapeze(%d, %d, %d);", side1, side2, side3));
    }
}
