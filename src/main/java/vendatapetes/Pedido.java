package vendatapetes;

import java.util.ArrayList;

/**
 *
 * @author Filipe de Freitas Martins da Silva - GRR20193884
 */
public class Pedido {
    private String CPFcliente;
    private ArrayList<Tapete> tapetes = new ArrayList<Tapete>();

    public String getCPFcliente() {
        return CPFcliente;
    }

    public void setCPFcliente(String CPFcliente) {
        this.CPFcliente = CPFcliente;
    }

    public ArrayList<Tapete> getTapetes() {
        return tapetes;
    }

    public void setTapetes(ArrayList<Tapete> tapetes) {
        this.tapetes = tapetes;
    }
    
}
