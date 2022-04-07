package shapes;

public class Trapeze extends Figures {
    private int a, b, c, d;

    public Trapeze(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public void Coordinates() {
        System.out.println(String.format("Trapeze(%d, %d, %d, %d);", a, b, c, d));
    }
}
