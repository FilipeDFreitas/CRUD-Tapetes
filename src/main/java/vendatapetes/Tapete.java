package vendatapetes;

/**
 *
 * @author Filipe de Freitas Martins da Silva - GRR20193884
 */
public class Tapete {
    private Forma formato;
    private int tamanho;
    private String material;
    private double preco;

    public Forma getFormato() {
        return formato;
    }

    public void setFormato(Forma formato) {
        this.formato = formato;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
