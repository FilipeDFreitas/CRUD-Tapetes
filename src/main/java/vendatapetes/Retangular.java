package vendatapetes;

/**
 *
 * @author Filipe de Freitas Martins da Silva - GRR20193884
 */
public class Retangular extends Forma{
    private double altura, largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    public void CalculaArea(double altura,double largura){
        this.setArea(altura*largura);
    }
}
