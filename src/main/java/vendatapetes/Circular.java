package vendatapetes;

/**
 *
 * @author Filipe de Freitas Martins da Silva - GRR20193884
 */
public class Circular extends Forma{
    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    public void CalculaArea(double raio){
        this.setArea(Math.PI*raio*raio);
    }
    
}
