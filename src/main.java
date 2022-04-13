import shapes.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();

        figures.add(new Rectangle(10,20));
        figures.add(new Line(12));
        figures.add(new Circle(100));
        figures.add(new Trapeze(1, 4, 4, 5));
        figures.add(new Square(37));
        figures.add(new Triangle(6, 6, 6));

        for (Figure figure: figures) {
            figure.showFigureInfo();
        }
    }
}
