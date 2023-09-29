package lista05.applications;

import javax.swing.JOptionPane;
import lista05.entities.ex01_Triangle;

public class ex01_MainTriangle {
    public static void main(String[] args) {
        ex01_Triangle x, y;
        x = new ex01_Triangle();
        y = new ex01_Triangle();

        // Coleta as medidas do triângulo X
        x.a = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure of side 'a' for triangle X:"));
        x.b = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure of side 'b' for triangle X:"));
        x.c = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure of side 'c' for triangle X:"));

        // Coleta as medidas do triângulo Y
        y.a = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure of side 'a' for triangle Y:"));
        y.b = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure of side 'b' for triangle Y:"));
        y.c = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure of side 'c' for triangle Y:"));

        JOptionPane.showMessageDialog(null, "Triangle X area: " + String.format("%.4f", x.area()));
        JOptionPane.showMessageDialog(null, "Triangle Y area: " + String.format("%.4f", y.area()));

        if (x.area() > y.area()) {
            JOptionPane.showMessageDialog(null, "Larger area: X");
        } else if (y.area() > x.area()) {
            JOptionPane.showMessageDialog(null, "Larger area: Y");
        } else {
            JOptionPane.showMessageDialog(null, "Both triangles have the same area.");
        }
    }
}
