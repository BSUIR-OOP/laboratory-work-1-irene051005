package shapes;

public class Trapeze extends Figure {
    private int side1, side2, side3, side4;

    public Trapeze(int side1, int side2, int side3, int side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    @Override
    public void showFigureInfo() {
        System.out.println(String.format("Trapeze(%d, %d, %d, %d);", side1, side2, side3, side4));
    }
}
