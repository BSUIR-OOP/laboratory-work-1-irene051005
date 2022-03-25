package shapes;

public class Square extends Figures {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void Coordinates() {
        System.out.println(String.format("Square(%d);", a));
    }
}
