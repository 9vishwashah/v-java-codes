class Pen {
    String color;
    String type;

    public void printPen() {
        System.out.println("The type of this pen is " + this.type);
        System.out.println("The color of this pen is " + this.color);
    }
}

public class ConstructorTypes {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "Gel pen";
        p1.printPen();

        Pen p2 = new Pen();
        p2.color = "black";
        p2.type = "Ball pen";
        p2.printPen();
    }
}
