package shapes;

public class Rect extends Figures {
    private int a, b;

    public Rect(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void Coordinates() {
        System.out.println(String.format("Rectangle(%d, %d);", a, b));
    }
}
