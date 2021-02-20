package vendatapetes;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Filipe de Freitas Martins da Silva - GRR20193884
 */
public class Controller {
    private static ArrayList<Cliente> Clientes = new ArrayList<Cliente>();
    
    public static Object[] incluirCliente(String jTextField1, String jTextField2, String jTextField3){
        if(!jTextField3.equals("")){
            Cliente c = new Cliente(jTextField1, jTextField2, jTextField3);
            Clientes.add(c);
        }
        return Clientes.toArray();
    }
    public static Object[] atualizarCliente(String jTextField1, String jTextField2, String jTextField3){
        for(Cliente c: Clientes){
            if(c.getCPF().equals(jTextField3))
                c.Alterar(jTextField1, jTextField2);
        }
        
        return Clientes.toArray();
    }
    public static Object[] removerCliente(String jTextField1, String jTextField2, String jTextField3){
        Cliente obj = new Cliente();
        for(Cliente c: Clientes){
            if(c.getCPF().equals(jTextField3))
                obj=c;  
        }
        Clientes.remove(obj);
        return Clientes.toArray();
    }
    public static Object[] listarCliente(Object[] obj){
        ArrayList<Cliente> Busca= new ArrayList<Cliente>();
        if(obj.length>3){
        String busca=obj[0].toString();
        String nome=obj[1].toString();
        String sobrenome=obj[2].toString();
        String cpf=obj[3].toString();
        
        for(Cliente c: Clientes){
            if((nome.equals("true")&& c.getNome().matches("(.*)"+busca+"(.*)"))
                    ||(sobrenome.equals("true")&& c.getSobrenome().matches("(.*)"+busca+"(.*)"))
                    ||(cpf.equals("true")&& c.getCPF().matches("(.*)"+busca+"(.*)"))){ 
                Busca.add(c);
            }
        }
        if(busca.isEmpty())
            return null;
        }
        return Busca.toArray();
    }
    
}
