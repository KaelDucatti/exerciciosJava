package lista05.entities;

public class ex06_Radius {
    public double radius;
    public final double PI = 3.14;

    public double circunference () {
        return 2 * PI * radius;
    }

    public double sphereVolume() {
        return  4.0 / 3.0 * PI * (radius * radius * radius);
    }
}
