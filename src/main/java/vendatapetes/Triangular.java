package vendatapetes;

/**
 *
 * @author Filipe de Freitas Martins da Silva - GRR20193884
 */
public class Triangular extends Forma {
    private double altura, base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public void CalculaArea(double altura,double base){
        this.setArea((altura*base)/2);
    }
}
