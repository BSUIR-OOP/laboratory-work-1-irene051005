package shapes;

public class Triangle extends Figures {
    private int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void Coordinates() {
        System.out.println(String.format("Trapeze(%d, %d, %d);", a, b, c));
    }
}
