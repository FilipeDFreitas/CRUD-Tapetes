package vendatapetes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Filipe de Freitas Martins da Silva - GRR20193884
 */
public class Controller {
    private static HashMap<String, Cliente> clientes = new HashMap<String, Cliente>();
    private static HashMap<String, Pedido> pedidos = new HashMap<String, Pedido>();
    
    public static void incluirCliente(String nome, String sobrenome, String CPF){
        if(!(CPF.equals("")||nome.equals("")||sobrenome.equals(""))){
            Cliente c = new Cliente(nome, sobrenome, CPF);
            clientes.put(CPF, c);
        }
    }
    public static void atualizarCliente(String nome, String sobrenome, String CPF){
        if(!CPF.equals("")){
        Cliente alvo =clientes.get(CPF);
        if(nome == ""){
            nome = alvo.getNome();
        }
        if(sobrenome == ""){
            sobrenome = alvo.getSobrenome();
        }
        if(alvo!=null){
        alvo.Alterar(nome, sobrenome);
        clientes.put(CPF, alvo);
        }
        }
    }
    public static void removerCliente(String CPF){
        clientes.remove(CPF);
    }
    
}
