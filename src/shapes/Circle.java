package shapes;

public class Circle extends Figures {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void Coordinates() {
        System.out.println(String.format("Circle(%d);", r));
    }
}
