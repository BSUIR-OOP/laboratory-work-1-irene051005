package shapes;

public class List {
    private Figures[] list = new Figures[6];
    private int index = 0;

    public void add(Figures figure) {
        this.list[index] = figure;
        index++;
    }

    public void show() {
        for (int i = 0; i < index; i++) {
            list[i].Coordinates();
        }
    }
}
