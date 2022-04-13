package shapes;

public class Line extends Figure {
    private int length;

    public Line (int length) {
        this.length = length;
    }

    @Override
    public void showFigureInfo() {
        System.out.println(String.format("Line(%d);", length));
    }
}
