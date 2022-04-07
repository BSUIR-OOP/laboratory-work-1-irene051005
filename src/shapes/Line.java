package shapes;

public class Line extends Figures{
    private int l;

    public Line (int l) {
        this.l = l;
    }

    @Override
    public void Coordinates() {
        System.out.println(String.format("Line(%d);", l));
    }
}
