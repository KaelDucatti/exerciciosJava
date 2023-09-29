package lista05.entities;

public class ex07_CurrecyConverter {
    public double dollar;
    public double boughtDollars;
    public final double IOF = 1.06;

    public double cambio() {
        return (dollar * boughtDollars) * IOF;
    }
}
