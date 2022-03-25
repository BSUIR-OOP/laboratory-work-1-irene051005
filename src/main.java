import shapes.*;

public class main {
    public static void main(String[] args) {
        List arr = new List();

        arr.add(new Rect(10,20));
        arr.add(new Line(12));
        arr.add(new Circle(100));
        arr.add(new Trapeze(1,4,4,5));
        arr.add(new Square(37));
        arr.add(new Triangle(6,6,6));

        arr.show();
    }
}
