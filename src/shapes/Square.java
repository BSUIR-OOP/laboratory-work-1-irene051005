package shapes;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void showFigureInfo() {
        System.out.println(String.format("Square(%d);", side));
    }
}
