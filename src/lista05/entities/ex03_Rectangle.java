package lista05.entities;

public class ex03_Rectangle {
    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * width + 2 * height;
    }

    public double diagonal() {
        return Math.sqrt((width * width) + (height * height));
    }
}
